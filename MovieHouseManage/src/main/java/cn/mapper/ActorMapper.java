package cn.mapper;

import cn.entity.Actor;

public interface ActorMapper {
    public int deleteByPrimaryKey(Integer aId);

    public int insert(Actor record);

    public int insertSelective(Actor record);

    public Actor selectByPrimaryKey(Integer aId);

    public int updateByPrimaryKeySelective(Actor record);

    public int updateByPrimaryKey(Actor record);
}