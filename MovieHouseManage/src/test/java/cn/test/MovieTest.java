package cn.test;

import cn.entity.Order;
import cn.entity.Ticket;
import cn.entity.User;
import cn.mapper.UserMapper;
import cn.service.UserService;
import cn.utils.NumberUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieTest {
    @Autowired
    private UserService us;
    @Test
    public void testUserSelect() throws Exception{

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        us = ac.getBean(UserService.class);
        Integer uid = 1;
        Integer rid = 2;
        Integer seatNum = 2;
        String seatInfo = "三排一号，三排二号";
        double price = 60.5;
        Integer status = 2;
        Date buyTime = new Date();
        String phone = "18878944578";
        String orderNum = NumberUtil.createCodeNum("10");
        Order order = new Order();
        order.setuId(uid);
        order.setrId(rid);
        order.setMoney(price);
        order.setAddTime(buyTime);
        order.setSeatNum(seatNum);
        order.setSeatInfo(seatInfo);
        order.setStatus(status);
        order.setoPhone(phone);
        order.setOrdernum(orderNum);
        us.addOrder(order);
    }
}
