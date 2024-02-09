package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/TableForJava";
    private static final String DB_User = "newuser";
    private static final String DB_Password = "password";

    public static   Connection getConnection() {
     Connection connection = null;

        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL,DB_User,DB_Password);
        } catch (ClassNotFoundException  |SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
