package cn.service.impl;

import cn.entity.Film;
import cn.entity.FilmImg;
import cn.mapper.FilmMapper;
import cn.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    @Override
    public int removeByPrimaryKey(Integer fId) {
        return filmMapper.deleteByPrimaryKey(fId);
    }


    @Override
    public int add(Film record) {
        return filmMapper.insert(record);
    }

    @Override
    public int addSelective(Film record) {
        return filmMapper.insertSelective(record);
    }

    @Override
    public Film queryByPrimaryKey(Integer fId) {
        return filmMapper.selectByPrimaryKey(fId);
    }

    @Override
    public int changeByPrimaryKeySelective(Film record) {
        return filmMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Film record) {
        return filmMapper.updateByPrimaryKey(record);
    }

    //查询所有电影
    @Override
    public List<Film> queryAllFilm() {
        return filmMapper.selectAllFilm();
    }

    //即将上映电影列表
    @Override
    public List<Film> queryByLessTime() {
        return filmMapper.selectByLessTime();
    }

    //正在热播电影列表
    @Override
    public List<Film> queryByGreaterTime() {
        return filmMapper.selectByGreaterTime();
    }

    //查询票房榜（前10）
    @Override
    public List<Film> queryByOffice() {
        return filmMapper.selectByOffice();
    }

    //查询期待榜（前50）
    @Override
    public List<Film> queryByExpectation() {
        return filmMapper.selectByExpectation();
    }

    //查询 top100（所有电影票房前100）
    @Override
    public List<Film> queryByTOP() {
        return filmMapper.selectByTOP();
    }

    //查询好评榜（前10）
    @Override
    public List<Film> queryByCount() {
        return filmMapper.selectByCount();
    }

    //根据动态条件（上映时间，电影类型，区域，年代）查询电影列表
    @Override
    public List<Film> queryByCondition() {
        return filmMapper.selectByCondition();
    }

    //查询电影所有信息（图集，演员。。。）
    @Override
    public List<Film> queryByFId(Integer fId) {
        return filmMapper.selectByFId(fId);
    }


}
