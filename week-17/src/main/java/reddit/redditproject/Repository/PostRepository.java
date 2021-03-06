package reddit.redditproject.Repository;

import reddit.redditproject.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    //write own query to find 10 votes desc
}
