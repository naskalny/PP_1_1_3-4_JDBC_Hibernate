package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("John", "Dope", (byte) 7);
        userDao.saveUser("Oleg", "Tinkoff", (byte) 43);
        userDao.saveUser("Michael", "Jackson", (byte) 12);
        userDao.saveUser("Elisabet", "Olsen", (byte) 27);

        try {
            List<User> userList = userDao.getAllUsers();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        userDao.cleanUsersTable();

        userDao.dropUsersTable();

    }
}
