package cn.mapper;

import cn.entity.Film;

public interface FilmMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKey(Film record);
}