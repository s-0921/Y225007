package cn.controller;

import cn.entity.Film;
import cn.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /*
     * 动态条件查询电影数据（分页查询）
     */
    @RequestMapping("/films")
    public String getFilms(@RequestParam(value="pn",defaultValue="1")Integer pn, Model model){

        //引入PageHelper分页插件
        //查询之前需要调用,,传入页码，以及每页的大小
        PageHelper.startPage(pn,5);
        //startPage后面紧跟的是这个查询就是一个分页查询
        List<Film> emps = filmService.queryByCondition();
        //使用pageInfo包装查询后的结果，只需要将Pageinfo交给页面就行了
        //封装了详细的分页信息，包括我们查出来的数据,传入连续显示的数据
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);
        return "";
    }
}
