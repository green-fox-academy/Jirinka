package reddit.redditproject.Controller;

import org.springframework.web.bind.annotation.*;
import reddit.redditproject.Model.Post;
import reddit.redditproject.Service.postService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class PostController {
    private final postService PostService;

    public PostController(postService PostService) {
        this.PostService = PostService;
    }


    @GetMapping({"/", "/{userName}/"})
    public String listAll(Model model, @PathVariable (required = false) String userName){
        model.addAttribute("list", PostService.listAll());
        return "main-page";
    }
    @GetMapping({"/submit", "/{userName}/submit"})
    public String addNewPost(@PathVariable (required = false) String userName){
        return "add-post";
    }

    @PostMapping("/{userName}/submit")
    public String addNew(@ModelAttribute (name = "post") Post post,@PathVariable (required = false) String userName){
        PostService.addPost(post,userName);
        return "redirect:/" + userName + "/";
    }
    @GetMapping("/{id}/vote")
    public String vote(@RequestParam (name = "upVote", required = false) boolean upVote,
                       @RequestParam (name = "downVote", required = false) boolean downVote,
                       @PathVariable long id){
        if (upVote){
            PostService.votePlus(id);
        }
        else {
            PostService.voteMinus(id);
        }
        return "redirect:/";
    }
}
