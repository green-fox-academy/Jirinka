package com.example.frontend.Controller;

import com.example.frontend.Model.Number;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/doubling")
    @ResponseBody
    public Number doubling(@RequestParam Integer input){
        return new Number(input);
    }


}
