package reddit.redditproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.redditproject.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

}
