package cn.mapper;

import cn.entity.Cinema;

public interface CinemaMapper {
    public int deleteByPrimaryKey(Integer cId);

    public int insert(Cinema record);

    public int insertSelective(Cinema record);

    public Cinema selectByPrimaryKey(Integer cId);

    public int updateByPrimaryKeySelective(Cinema record);

    public int updateByPrimaryKey(Cinema record);
}