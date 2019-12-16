package cn.controller;

import cn.utils.YunPianTool;
import com.yunpian.sdk.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class YunPianController {

    private static String itsphone;
    private static Integer itscode;
    @RequestMapping(value = "/YunPianLogin")
    public ModelAndView YunPianLogin(){
        ModelAndView mv  =new ModelAndView();
        mv.setViewName("YunPianLogin");
        return mv;
    }
    @RequestMapping(value = "/doYunPianLogin")
    public ModelAndView doYunPianLogin(String name,String pwd,String phone,Integer msgcode){
        ModelAndView mv=new ModelAndView();
        System.out.println(name+","+pwd+","+phone+","+msgcode);
        System.out.println("itscode:"+itscode);
        System.out.println("itsphone:"+itsphone);
        if(name.equals("admin") && pwd.equals("admin")){
            if(phone.equals(itsphone) && msgcode.equals(itscode)){
                itscode=null;
                itsphone=null;
                mv.setViewName("studentlogin");
                return mv;
            }
        }
        mv.setViewName("error");
        mv.addObject("inp", "验证码或密码错误");
        return mv;
    }
    @RequestMapping(value = "/getcode")
    @ResponseBody
    public Result getcode(@RequestBody Result result){
        System.out.println("手机号码："+result.getDetail());
        int ran=(int)(Math.random()*9000)+1000;

        String text="【********】您的验证码是"+ran;
        itscode=ran;
        itsphone=result.getDetail();
        System.out.println("验证码是："+ran);
        new YunPianTool().Main(result.getDetail(),text);
        return result;
    }
}
