package com.help.back.backend.dao;

import com.help.back.backend.dto.Login;
import com.help.back.backend.domain.User;
import com.help.back.backend.dto.ResultUser;

import java.util.List;

public interface UserDao {
    List<ResultUser> getUsers();
    List<ResultUser> getUsersByName(String name);
    List<ResultUser> getUsersByEmail(String email);
    List<ResultUser> getUsersById(int id);
    ResultUser login(Login login);
    int postUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
