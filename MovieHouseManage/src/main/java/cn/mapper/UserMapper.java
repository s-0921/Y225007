package cn.mapper;

import cn.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uIdu);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uIdu);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();

    User selectByPhone(String phone);
}