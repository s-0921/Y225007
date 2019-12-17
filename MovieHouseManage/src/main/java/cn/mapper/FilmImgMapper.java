package cn.mapper;

import cn.entity.FilmImg;

public interface FilmImgMapper {
    public int insert(FilmImg record);

    public int insertSelective(FilmImg record);
}