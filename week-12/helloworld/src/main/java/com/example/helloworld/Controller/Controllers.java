package com.example.helloworld.Controller;

import com.example.helloworld.service.UtilityService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class Controllers {

    public final UtilityService utilityService;

    public Controllers(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String mainPage(){
        return "mainPage";
    }
    
    @GetMapping("/useful/colored")
    public String randomColor(Model model){
        model.addAttribute("color", utilityService.randomColor() );
        return "randomPage";
    }
    @GetMapping("/useful/email")
    public String emailValidator(Model model, @RequestParam String email){
        model.addAttribute("valid", utilityService.validateEmail(email));
        model.addAttribute("emailAddress", email);
        return "emailPage";
    }
    @GetMapping("/useful/encode")
    public String encode(Model model, @RequestParam String text, @RequestParam int number){
        model.addAttribute("text", utilityService.caesar(text,number));
        return "encoded";
    }
    @GetMapping("/useful/decode")
    public String decode(Model model, @RequestParam String text, @RequestParam int number){
        model.addAttribute("text", utilityService.caesar(text,-number));
        return "encoded";
    }



}
