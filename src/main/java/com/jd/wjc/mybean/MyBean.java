package com.jd.wjc.mybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * Created by jichuan.wang on 2017/12/14.
 */
@Component
public class MyBean {

    @Autowired
    public MyBean(ApplicationArguments args){
        Set<String> set = args.getOptionNames();
        List<String> list = args.getNonOptionArgs();
        System.out.println("不是可选的参数");
        list.forEach(s -> {
            System.out.println(s);
        });
        System.out.println("可选参数");
        for(String s : set){
            System.out.println(s);
        }
    }
}
