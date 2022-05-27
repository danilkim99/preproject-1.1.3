package jm.task.core.jdbc.util;


import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection connection;
    public static Statement statement;
    public static final String USER_NAME = "passwoord";
    public static final String PASSWORD = "name";
    public static final String URL = "url";

    static {
        try {
            connection = DriverManager.getConnection(URL,USER_NAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException();
        }
    }
}
