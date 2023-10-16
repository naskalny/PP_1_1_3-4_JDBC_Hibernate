package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.saveUser("John", "Dope", (byte) 7);
        userService.saveUser("Oleg", "Tinkoff", (byte) 43);
        userService.saveUser("Michael", "Jackson", (byte) 12);
        userService.saveUser("Elisabet", "Olsen", (byte) 27);

        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
