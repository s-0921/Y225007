package cn.mapper;

import cn.entity.FilmImg;

public interface FilmImgMapper {
    int insert(FilmImg record);

    int insertSelective(FilmImg record);
}