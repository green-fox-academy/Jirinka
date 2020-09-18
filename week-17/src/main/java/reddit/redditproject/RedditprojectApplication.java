package reddit.redditproject;

import reddit.redditproject.Model.Post;
import reddit.redditproject.Repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditprojectApplication implements CommandLineRunner {

    private final PostRepository postRepository;

    public RedditprojectApplication(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditprojectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
