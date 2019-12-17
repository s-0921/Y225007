package cn.service;

import cn.entity.Cinema;

public interface CinemaService {

    //根据主键id删除
    public int deleteByPrimaryKey(Integer cId);

    //新增电影院
    public int insert(Cinema record);

    //新增
    public int insertSelective(Cinema record);

    public Cinema selectByPrimaryKey(Integer cId);

    public int updateByPrimaryKeySelective(Cinema record);

    public int updateByPrimaryKey(Cinema record);
}
