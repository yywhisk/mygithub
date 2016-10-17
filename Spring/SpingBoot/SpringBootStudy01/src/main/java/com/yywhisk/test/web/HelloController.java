package com.yywhisk.test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/10/16.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "Hello world!";
    }
}
