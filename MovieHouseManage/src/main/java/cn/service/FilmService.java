package cn.service;

import cn.entity.ActorByFilm;
import cn.entity.Film;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface FilmService {



    List<Film> getAllFilm();

    Film getFilmByName(String name);

    List<Film> getFilmByType(String type);

    List<Film> getFilmByArea(String area);

    List<Film> getFilmByShowTime();

    List<Film> getFilmByLessTime();

    List<Film> getByOffice();

    List<Film> getByOffice_100();

    List<Film> getByExpect();

    List<Film> getByScore();

    List<Film> getFilmByCondition(String type, String area, String time);
}
