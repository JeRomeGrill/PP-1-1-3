package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Roman","Glushko", (byte) 29);
        userService.saveUser("Max","Sychev", (byte) 18);
        userService.saveUser("Petr","Popov", (byte) 34);
        userService.saveUser("Nikita","Alexeev", (byte) 51);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
