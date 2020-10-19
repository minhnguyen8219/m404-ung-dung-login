package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users = new ArrayList<>();
    static {
        User u1 = new User();
        u1.setName("Minh");
        u1.setEmail("Minh@gmail.com");
        u1.setAccount("minh");
        u1.setPassword("1");
        users.add(u1);

        User u5 = new User();
        u5.setName("Beo");
        u5.setEmail("Beo@gmail.com");
        u5.setAccount("beo");
        u5.setPassword("1");
        users.add(u5);

        User u2 = new User();
        u2.setName("Hung");
        u2.setEmail("Hung@gmail.com");
        u2.setAccount("hung");
        u2.setPassword("1");
        users.add(u2);

        User u3 = new User();
        u3.setName("Dung");
        u3.setEmail("Dung@gmail.com");
        u3.setAccount("dung");
        u3.setPassword("1");
        users.add(u3);

        User u4 = new User();
        u4.setName("Luc");
        u4.setEmail("Luc@gmail.com");
        u4.setAccount("luc");
        u4.setPassword("1");
        users.add(u4);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getPassword().equals(login.getPassword()) && u.getAccount().equals(login.getAccount())) {
                return u;
            }
        }
        return null;
    }
}
