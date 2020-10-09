package com.greenfox.exampleexam.Controller;

import com.greenfox.exampleexam.DTO.ShortenCodeDTO;
import com.greenfox.exampleexam.DTO.ShortensDto;
import com.greenfox.exampleexam.Model.Shortens;
import com.greenfox.exampleexam.Service.ShortensServiceImpl;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    private final ShortensServiceImpl shortensService;

    public MainController(ShortensServiceImpl shortensService) {
        this.shortensService = shortensService;
    }
    @GetMapping("/")
    public String main(){
        return "main-page";
    }
    @PostMapping("/save-link")
    public String save(@ModelAttribute (name = "shorten") Shortens shortens, Model model){
        if(shortensService.aliasExists(shortens.getAlias())){
            model.addAttribute("usedAlias", "This alias is already in use");
        } else {
            shortensService.addShort(shortens);
            String s = "Your URL is aliased to " + shortens.getAlias() + " and your secret code is " + shortens.getRandomNumber();
            model.addAttribute("success", s);
        }
        return "main-page";
    }
    @GetMapping("/a/{alias}")
    public void goTo(@PathVariable String alias, HttpServletResponse httpServletResponse){
        if(shortensService.aliasExists(alias)){
            shortensService.increaseHit(alias);
            httpServletResponse.setHeader("Location", shortensService.goToUrl(alias));
            httpServletResponse.setStatus(302);
            }

         else {
            httpServletResponse.setStatus(404);
        }
    }
    @GetMapping("/api/links")
    @ResponseBody
    public List<ShortensDto> getLinks(){
        return shortensService.allShortensDTO();
    }
    @DeleteMapping("/api/links/{id}")
    @ResponseBody
    public ResponseEntity delete(@PathVariable long id, @RequestBody ShortenCodeDTO shortenCodeDTO){

        return  shortensService.deleteShorten(id,shortenCodeDTO);
    }

}


