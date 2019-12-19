package cn.service;

import cn.entity.Film;
import cn.entity.FilmImg;

import java.util.List;


public interface FilmService {
    public int removeByPrimaryKey(Integer fId);

    public int add(Film record);

    public int addSelective(Film record);

    public Film queryByPrimaryKey(Integer fId);

    public int changeByPrimaryKeySelective(Film record);

    public int changeByPrimaryKey(Film record);

    //查询所有电影
    public List<Film> queryAllFilm();

    //即将上映电影列表
    public List<Film> queryByLessTime();

    //正在热播电影列表
    public List<Film> queryByGreaterTime();

    //查询票房榜（前10）
    public List<Film> queryByOffice();

    //查询期待榜（前50）
    public List<Film> queryByExpectation();

    //查询 top100（所有电影票房前100）
    public List<Film> queryByTOP();

    //查询好评榜（前10）
    public List<Film> queryByCount();

    //根据动态条件（上映时间，电影类型，区域，年代）查询电影列表
    public List<Film> queryByCondition();

    //根据id查询电影所有信息（图集，演员。。。）
    public List<Film> queryByFId(Integer fId);

}
