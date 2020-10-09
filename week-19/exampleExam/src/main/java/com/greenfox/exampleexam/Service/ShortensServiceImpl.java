package com.greenfox.exampleexam.Service;

import com.greenfox.exampleexam.DTO.ShortenCodeDTO;
import com.greenfox.exampleexam.DTO.ShortensDto;
import com.greenfox.exampleexam.Model.Shortens;
import com.greenfox.exampleexam.Repository.ShortensRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ShortensServiceImpl implements ShortensService {

    private final ShortensRepository shortensRepository;

    public ShortensServiceImpl(ShortensRepository shortensRepository) {
        this.shortensRepository = shortensRepository;
    }

    @Override
    public void addShort(Shortens shortens) {
        shortensRepository.save(shortens);
    }
    public boolean aliasExists(String alias){
        Shortens shortens = shortensRepository.findByAlias(alias);
        if(shortens!=null){
            return true;
        } else return false;
    }

    @Override
    public void increaseHit(String alias) {
        Shortens shortens = shortensRepository.findByAlias(alias);
        int hc = shortens.getHitCount();
        hc += 1;
        shortens.setHitCount(hc);
        shortensRepository.save(shortens);
    }

    @Override
    public String goToUrl(String alias) {
        return shortensRepository.findByAlias(alias).getUrl();
    }
    @Override
    public List<ShortensDto> allShortensDTO(){
        List<Shortens> shortens = shortensRepository.findAll();
        List<ShortensDto> dtoShorts = new ArrayList<>();
        for (Shortens shortcut : shortens) {
            dtoShorts.add(new ShortensDto(shortcut));

        }
        return dtoShorts;
    }
    @Override
    public ResponseEntity deleteShorten(long id, ShortenCodeDTO shortenCodeDTO){
            Shortens shortens = shortensRepository.findById(id).orElse(null);
            if (shortens !=null){
                if(idAliasMatch(id, shortenCodeDTO.getSecretCode())){
                  shortensRepository.delete(shortens);
                  return ResponseEntity.noContent().build();
                } else  return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
            } else return ResponseEntity.notFound().build();
    }


    @Override
    public boolean idAliasMatch(long id, String secretCode){
        Shortens shortens = shortensRepository.findById(id).orElse(null);
        String itsSecretCode = shortens.getSecretCode();


        return (itsSecretCode.equals(secretCode));

    }
}
