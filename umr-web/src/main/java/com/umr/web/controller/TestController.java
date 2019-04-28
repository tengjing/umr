package com.umr.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/22 11:17
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("/index***************");
        return "indexz";
    }
}
