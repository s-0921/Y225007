package cn.mapper;

import cn.entity.Film;
import cn.entity.FilmImg;

import java.util.List;

public interface FilmMapper {
    public int deleteByPrimaryKey(Integer fId);

    public int insert(Film record);

    public int insertSelective(Film record);

    public Film selectByPrimaryKey(Integer fId);

    public int updateByPrimaryKeySelective(Film record);

    public int updateByPrimaryKey(Film record);


    //查询所有电影
    public List<Film> selectAllFilm();

    //即将上映电影列表
    public List<Film> selectByLessTime();

    //正在热播电影列表
    public List<Film> selectByGreaterTime();

    //查询票房榜（前10）
    public List<Film> selectByOffice();

    //查询期待榜（前50）
    public List<Film> selectByExpectation();

    //查询 top100（所有电影票房前100）
    public List<Film> selectByTOP();

    //查询好评榜（前10）
    public List<Film> selectByCount();

    //根据动态条件（上映时间，电影类型，区域，年代）查询电影列表
    public List<Film> selectByCondition();

    //根据id查询电影所有信息（图集，演员。。。）
    public List<Film> selectByFId(Integer fId);
}