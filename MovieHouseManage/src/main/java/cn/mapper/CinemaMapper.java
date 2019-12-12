package cn.mapper;

import cn.entity.Cinema;

public interface CinemaMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Cinema record);

    int insertSelective(Cinema record);

    Cinema selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Cinema record);

    int updateByPrimaryKey(Cinema record);
}