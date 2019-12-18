package cn.service;

import cn.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Integer addUser(User user);

    User getByPhone(String phone);

}