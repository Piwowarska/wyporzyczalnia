package pl.camp.it.rent.database;

import org.springframework.stereotype.Component;
import pl.camp.it.rent.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDatabase {
    private final List<User> users =new ArrayList<>();

    public UserDatabase() {
        this.users.add(new User("admin","admin"));
        this.users.add(new User("pasword","pasword"));

    }

    public List<User> getUsers() {
        return users;
    }
}
