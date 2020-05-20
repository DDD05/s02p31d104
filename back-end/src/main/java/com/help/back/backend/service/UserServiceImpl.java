package com.help.back.backend.service;

import com.help.back.backend.dao.UserDao;
import com.help.back.backend.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User> getUsersByEmail(String email) {
        return userDao.getUsersByEmail(email);
    }

    @Override
    public List<User> getUsersById(int user_id) {
        return userDao.getUsersById(user_id);
    }

    @Override
    public int postUser(User user) {
        return userDao.postUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(int user_id) {
        return userDao.deleteUser(user_id);
    }
}
