package com.jd.wjc;

import com.jd.wjc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jichuan.wang on 2017/12/14.
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
public class Example {
    @Autowired
    private HelloService helloService;

    @Value("${random.int}")
    private String aa;

    @RequestMapping("/")
    public String home(){
        System.out.println(aa);
        return helloService.hello();
    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Example.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
