package com.thw.test;

import com.thw.test.entity.Admin;
import com.thw.test.service.impl.AdminServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapperTest {

    @Test
    public void mapperTest01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        AdminServiceImpl adminService = context.getBean("adminServiceImpl", AdminServiceImpl.class);

        Admin adminInfo = adminService.getAdminInfo(1L);

        System.out.println(adminInfo.getId());
        System.out.println(adminInfo.getPassword());
        System.out.println(adminInfo.getPassword());
    }

}
