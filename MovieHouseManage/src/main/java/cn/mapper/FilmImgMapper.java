package cn.mapper;

import cn.entity.FilmImg;

import java.util.List;

public interface FilmImgMapper {
    public void insert(FilmImg record);

    public void insertSelective(FilmImg record);

    //根据id查询电影图集
    public List<FilmImg> selectByFilmId(Integer fId);

    //删除图片
    public void deleteById(Integer id);
}