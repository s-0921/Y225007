package cn.controller;

import cn.entity.Film;
import cn.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/film")
@SessionAttributes(value = {"allFilm"})
public class FilmController {

    @Autowired
    private FilmService filmService;

    //所有电影列表
    @RequestMapping("/allFilm")
    public void allFilm(Model model){

        List<Film> allFilm=filmService.queryAllFilm();
        model.addAttribute(allFilm);

        Map<String,Object> map=new HashMap<String, Object>();

        map.put("allFilm",allFilm);



    }

    //正在上映电影列表
    @RequestMapping("/hitFilmList")
    public String hitFilmList(Model model){

        List<Film> hitFilmList = filmService.queryByGreaterTime();
        model.addAttribute("hitFilmList",hitFilmList);
        return "";
    }

    //即将上映电影列表
    @RequestMapping("/upcomingFilmList")
    public String upcomingFilmList(Model model){
        List<Film> upcomingFilmList = filmService.queryByLessTime();
        model.addAttribute("upcomingFilmList",upcomingFilmList);
        return "";
    }

    //查询票房榜（前10）
    @RequestMapping("/boxOffice")
    public String boxOffice(Model model){
        List<Film> upcomingFilmList = filmService.queryByOffice();
        model.addAttribute("upcomingFilmList",upcomingFilmList);
        return "";
    }

    //查询期待榜（前50）
    @RequestMapping("/boxExpectation")
    public String boxExpectation(Model model){
        List<Film> upcomingFilmList = filmService.queryByExpectation();
        model.addAttribute("upcomingFilmList",upcomingFilmList);
        return "";
    }
    //查询 top100（所有电影票房前100）
    @RequestMapping("/top")
    public String top(Model model){
        List<Film> upcomingFilmList = filmService.queryByTOP();
        model.addAttribute("upcomingFilmList",upcomingFilmList);
        return "";
    }
    //查询好评榜（前10）
    @RequestMapping("/boxScore")
    public String boxScore(Model model){
        List<Film> upcomingFilmList = filmService.queryByCount();
        model.addAttribute("upcomingFilmList",upcomingFilmList);
        return "";
    }
}
