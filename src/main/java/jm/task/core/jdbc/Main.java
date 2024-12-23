package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util util = new Util();
        Util.getConnection();

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        //userService.saveUser("Иван", "Безухов", (byte) 15);
    }
}
