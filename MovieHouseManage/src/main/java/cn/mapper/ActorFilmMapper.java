package cn.mapper;

import cn.entity.ActorFilm;

public interface ActorFilmMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActorFilm record);

    int insertSelective(ActorFilm record);

    ActorFilm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActorFilm record);

    int updateByPrimaryKey(ActorFilm record);
}