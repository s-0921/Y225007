package cn.mapper;

import cn.entity.Actor;

public interface ActorMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Actor record);

    int insertSelective(Actor record);

    Actor selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}