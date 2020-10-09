package com.example.frontend.Controller;

import com.example.frontend.Model.Append;
import com.example.frontend.Model.Error;
import com.example.frontend.Model.Greeting;
import com.example.frontend.Model.Number;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<Object> doubling(@RequestParam (required = false) Integer input){
        if (input!=null) {
            return new ResponseEntity<>(new Number(input), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Error("Please provide an input!"), HttpStatus.OK);
        }
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<Object> greet(@RequestParam (required = false) String name, String title){
        if (name != null && title != null) {
            return new ResponseEntity<>(new Greeting("Oh, hi there " + name + ", my dear " + title + "!"), HttpStatus.OK);
        }
        else if (name == null && title != null){
            return new ResponseEntity<>(new Error("Please provide a name!"), HttpStatus.BAD_REQUEST);
        }
        else if (name != null && title == null){
            return new ResponseEntity<>(new Error("Please provide a title!"), HttpStatus.BAD_REQUEST);
        }
        else return new ResponseEntity<>(new Error("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public Append appendA(@PathVariable (required = false) String appendable){

        if (appendable != null){
            String a = appendable + "a";
            return (new Append(a));
        } else return new Append("bad request");
    }
}
