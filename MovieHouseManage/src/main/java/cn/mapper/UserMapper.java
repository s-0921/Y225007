package cn.mapper;

import cn.entity.User;

public interface UserMapper {
    public int deleteByPrimaryKey(Integer uIdu);

    public int insert(User record);

    public int insertSelective(User record);

    public User selectByPrimaryKey(Integer uIdu);

    public int updateByPrimaryKeySelective(User record);

    public int updateByPrimaryKey(User record);
}