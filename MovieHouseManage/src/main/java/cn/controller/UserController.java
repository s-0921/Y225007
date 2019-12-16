package cn.controller;

import cn.entity.User;
import cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService us;


    @RequestMapping("/login")
    @ResponseBody
    public Boolean login(String phone, String pwd){
        if (phone.trim() != ""&&pwd.trim() != ""){//判断传入数据是否为空
            User userON = us.getByPhone(phone);//根据电话查询信息
            if(userON == null){//判断查询信息是否为空
                return false;//回调信息
            }else{
                if(userON.getuPwd().equals(pwd)){//判断密密码是否正确
                    return true;
                }else{
                    return false;
                }
            }
        }
        return null;
    }

    @RequestMapping("/rePhone")
    @ResponseBody
    public Boolean rePhone(String phone){
        List<User> list = us.getAllUsers();
        for (User u:list) {
            if(u.getuPhone().trim().equals(phone.trim())){
                return true;
            }
        }
        return false;
    }
    @RequestMapping("/register")
    @ResponseBody
    public boolean register(User user){
        if(user.getuPhone()!=null){
            Integer result = us.addUser(user);
            if(result == 1){
                return true;
            }
        }
        return false;
    }

}
