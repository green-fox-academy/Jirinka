package reddit.redditproject.Service;

import reddit.redditproject.Model.Post;
import reddit.redditproject.Repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class postServiceImpl implements postService{

    public final PostRepository postRepository;

    public postServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> listAll() {
        return postRepository.findAll();
    }
    @Override
    public void addPost(Post post){
        postRepository.save(post);
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

}
