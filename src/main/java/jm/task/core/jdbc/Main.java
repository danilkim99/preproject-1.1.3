package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        // реализуйте алгоритм здесь
        userDao.createUsersTable();


        userDao.saveUser("Danil", "Kim", (byte)22);
        userDao.saveUser("Jenya", "Kim", (byte)23);
        userDao.saveUser("Alex", "Kim", (byte)25);
        userDao.saveUser("David", "Kim", (byte)26);

        userDao.removeUserById(2);

        List<User> user = userDao.getAllUsers();
        for (User value : user) {
            System.out.println(value);
        }

        userDao.cleanUsersTable();

        userDao.dropUsersTable();

    }
}
