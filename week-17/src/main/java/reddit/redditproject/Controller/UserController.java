package reddit.redditproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import reddit.redditproject.Service.userService;

@Controller
public class UserController {

    public final userService UserService;

    public UserController(reddit.redditproject.Service.userService userService) {
        this.UserService = userService;
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    //@RequestParam (value = "username") String userName

    @PostMapping("/login")
    public String log(String name, String password, Model model){
        if (UserService.userExists(name)){
            if(UserService.checkPassword(name, password)){
                return "redirect:/" + name + "/";
            } else {
                model.addAttribute("error", "Bad Password");
                return "login";
            }
        } else return "redirect:/register";
    }
    @GetMapping("/register")
    public String register(){
        return "registration";
    }

    @PostMapping("/register")
    public String register(String name, String password){
        UserService.register(name, password);
        return "redirect:/" + name + "/";
    }

}
