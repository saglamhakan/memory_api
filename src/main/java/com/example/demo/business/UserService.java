package com.example.demo.business;

import com.example.demo.business.model.User;
import com.example.demo.dao.UserDao;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public void add(User user){
        if(validateUser(user)){
            userDao.add(user);
        }
    }

    public List<User> getAll(){
        return userDao.getAll();
    }

    private boolean validateUser(User user){
        boolean isValidated = true;

        if(user.getFirstName() == null || user.getLastName() == null){
            isValidated = false;

        }
        return isValidated;
    }
}
