package reddit.redditproject.Service;

import reddit.redditproject.Model.Post;
import reddit.redditproject.Repository.PostRepository;
import org.springframework.stereotype.Service;
import reddit.redditproject.Repository.UserRepository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class postServiceImpl implements postService{

    public final PostRepository postRepository;
    public final UserRepository userRepository;

    public postServiceImpl(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Post> listAll() {
        return postRepository.findAll();
    }
    @Override
    public Post addPost(Post post, String userName){
        post.setUser(userRepository.findByUserName(userName));
       return postRepository.save(post);
    }

    @Override
    public void votePlus(long id) {
        var post = postRepository.getOne(id);
        int currentVotes = post.getVotes();
        post.setVotes(currentVotes + 1);
        postRepository.save(post);
    }

    @Override
    public void voteMinus(long id) {
        int currentVotes = postRepository.getOne(id).getVotes();
        var post = postRepository.getOne(id);
        post.setVotes(currentVotes - 1);
        postRepository.save(post);
    }
    @Override
    public String getCurrentTimeUsingDate(){
        Date date = new Date();
        String stringDateFormat = "HH:mm:ss";
        DateFormat dateFormat = new SimpleDateFormat(stringDateFormat);
        String finalDate = dateFormat.format(date);
        return finalDate;
    }

}
