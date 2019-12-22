package cn.service;

import cn.entity.Order;
import cn.entity.Ticket;
import cn.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Integer addUser(User user);

    User getByPhone(String phone);

    Integer addOrder(Order order);

    Integer addTicKet(Ticket ticket);

}