package cn.service;

import cn.entity.Film;

import java.util.Date;
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
}
