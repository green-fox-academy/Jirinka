package reddit.redditproject.Service;

import org.springframework.stereotype.Service;
import reddit.redditproject.Model.User;
import reddit.redditproject.Repository.UserRepository;

@Service
public class useServiceImpl implements userService {

    public final UserRepository userRepository;

    public useServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(String name, String password) {
        return userRepository.save(new User(name, password));
    }

    @Override
    public boolean checkPassword(String name, String password) {
        User user = userRepository.findByUserName(name);

        if (userExists(name)){
            return ((user.getPassword()).equals(password));
        } else return false;
        //userRepository.save(new User (name, password)); do Controller
    }
    @Override
    public boolean userExists(String name){
        return (userRepository.findByUserName(name) != null);
    }
}
