package cn.mapper;

import cn.entity.User;

import java.util.List;

public interface UserMapper {
    public int deleteByPrimaryKey(Integer uIdu);

    public int insert(User record);

    public int insertSelective(User record);

    public User selectByPrimaryKey(Integer uIdu);

    public int updateByPrimaryKeySelective(User record);

<<<<<<< HEAD
    public int updateByPrimaryKey(User record);
=======
    int updateByPrimaryKey(User record);

    List<User> selectAll();

    User selectByPhone(String phone);
>>>>>>> 851f505181169de7bf356064d9085808d5224193
}