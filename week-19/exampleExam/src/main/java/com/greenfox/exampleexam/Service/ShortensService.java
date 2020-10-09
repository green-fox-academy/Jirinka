package com.greenfox.exampleexam.Service;

import com.greenfox.exampleexam.DTO.ShortenCodeDTO;
import com.greenfox.exampleexam.DTO.ShortensDto;
import com.greenfox.exampleexam.Model.Shortens;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ShortensService {
    void addShort(Shortens shortens);
    boolean aliasExists(String alias);
    void increaseHit(String alias);
    String goToUrl(String alias);
    List<ShortensDto> allShortensDTO();
    boolean idAliasMatch(long id, String secretCode);
    ResponseEntity deleteShorten(long id, ShortenCodeDTO shortenCodeDTO);

}
