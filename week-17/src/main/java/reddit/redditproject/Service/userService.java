package reddit.redditproject.Service;

import reddit.redditproject.Model.User;

public interface userService {

    User register(String name, String password);

    boolean checkPassword(String name, String password);
    boolean userExists(String name);
}
