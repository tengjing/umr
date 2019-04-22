package com.umr.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/22 11:17
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/a")
    public int a(@RequestParam int a) {
        return a + 1;
    }
}
