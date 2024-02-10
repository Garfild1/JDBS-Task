package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;


public class Main extends UserDaoJDBCImpl {
    public static void main(String[] args) {
        UserDaoJDBCImpl user = new UserDaoJDBCImpl();
        user.createUsersTable();
        user.saveUser("NameOne", "LastNameOne", (byte) 11);
        user.saveUser("NameTwo", "LastNameTwo", (byte) 22);
        user.saveUser("NameThree", "LastNameThree", (byte) 33);
        user.saveUser("NameFour", "LastNameFour", (byte) 44);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();


    }
}

