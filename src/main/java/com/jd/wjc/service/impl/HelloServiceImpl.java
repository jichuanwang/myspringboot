package com.jd.wjc.service.impl;

import com.jd.wjc.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by jichuan.wang on 2017/12/14.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Value("${message}")
    private String message;
    public String hello() {
        return message;
    }
}
