package com.umr.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author tengjing@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/4/22 15:03
 */
@Configuration
@ComponentScan({"com.umr.**"})
@MapperScan("com.umr.dao.mapper.**")
public class UmrConfiguration {
}
