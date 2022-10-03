package com.example.demo.dao;

import com.example.demo.business.model.User;

import java.util.Date;
import java.util.List;

public class UserDao {

    private List<User> users = List.of(new User[]{
        new User(1, "hakkı", "sağlam", new Date())
    });

    public void add(User user){
        this.users.add(user);
    }

    public List<User> getAll(){
        return users;
    }
}
