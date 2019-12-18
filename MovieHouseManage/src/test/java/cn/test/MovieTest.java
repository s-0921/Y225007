package cn.test;

import cn.entity.User;
import cn.mapper.UserMapper;
import cn.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MovieTest {
    @Autowired
    private UserService us;
    @Test
    public void testUserSelect() throws Exception{

        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        us = ac.getBean(UserService.class);
        User user = us.getByPhone("15312135");
        System.out.println(user);
    }
}
