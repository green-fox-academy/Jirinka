package reddit.redditproject.Controller;

import org.springframework.web.bind.annotation.*;
import reddit.redditproject.Model.Post;
import reddit.redditproject.Service.postService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PostController {
    private final postService postService;

    public PostController(reddit.redditproject.Service.postService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String listAll(Model model){
        model.addAttribute("list", postService.listAll());
        return "main-page";
    }
    @GetMapping("/submit")
    public String addNewPost(){
        return "add-post";
    }
    @PostMapping("/submit")
    public String addNew(@ModelAttribute (name = "post") Post post){
        postService.addPost(post);
        return "redirect:/";
    }
    @GetMapping("/{id}/vote")
    public String vote(@RequestParam (name = "upVote", required = false) boolean upVote,
                       @RequestParam (name = "downVote", required = false) boolean downVote,
                       @PathVariable long id){
        if (upVote){
            postService.votePlus(id);
        }
        else {
            postService.voteMinus(id);
        }
        return "redirect:/";
    }
}
