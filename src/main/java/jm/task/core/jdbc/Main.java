package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Евгений", "Севостьянов", (byte) 28);
        userService.saveUser("Иван", "Петров", (byte) 31);
        userService.saveUser("Сергей", "Смирнов", (byte) 24);
        userService.saveUser("Владислав", "Иванов", (byte) 22);
        System.out.println(userService.getAllUsers());
        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.getAllUsers();
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        System.out.println(userService.getAllUsers());
        userService.dropUsersTable();
    }
}

