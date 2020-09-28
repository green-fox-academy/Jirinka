package reddit.redditproject.Service;

import reddit.redditproject.Model.Post;

import java.util.List;

public interface postService {
    List<Post> listAll();
    Post addPost(Post post, String userName);
    void votePlus(long id);
    void voteMinus(long id);
    String getCurrentTimeUsingDate();

}
