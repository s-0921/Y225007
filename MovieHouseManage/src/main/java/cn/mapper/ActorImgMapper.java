package cn.mapper;

import cn.entity.ActorImg;

public interface ActorImgMapper {
    public int deleteByPrimaryKey(Integer id);

    public int insert(ActorImg record);

    public int insertSelective(ActorImg record);

    public ActorImg selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(ActorImg record);

    public int updateByPrimaryKey(ActorImg record);
}