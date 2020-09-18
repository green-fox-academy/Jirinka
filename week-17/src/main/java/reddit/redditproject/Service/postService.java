package reddit.redditproject.Service;

import reddit.redditproject.Model.Post;

import java.util.List;

public interface postService {
    List<Post> listAll();
    void addPost(Post post);
    void votePlus(long id);
    void voteMinus(long id);

}
