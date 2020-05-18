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
}