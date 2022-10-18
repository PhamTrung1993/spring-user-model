package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class UserDAO {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(10);
        u1.setName("John");
        u1.setAccount("john");
        u1.setEmail("jonh@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(16);
        u2.setName("Mike");
        u2.setAccount("mike");
        u2.setEmail("mike@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(15);
        u3.setName("Bill");
        u3.setAccount("bill");
        u3.setEmail("bill@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login){
        for (User u:users) {
             if (Objects.equals(u.getAccount(),login.getAccount())
                 && Objects.equals(u.getPassword(),login.getPassword())){
                 return u;
             }
        }
        return null;
    }

}
