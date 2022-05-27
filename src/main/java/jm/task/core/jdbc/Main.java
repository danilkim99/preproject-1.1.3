package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Danil", "Kim", (byte)22);
        userService.saveUser("Jenya", "Kim", (byte)23);
        userService.saveUser("Alex", "Kim", (byte)25);
        userService.saveUser("David", "Kim", (byte)26);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
