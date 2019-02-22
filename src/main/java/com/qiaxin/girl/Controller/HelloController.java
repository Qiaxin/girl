package com.qiaxin.girl.Controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 10:57 2018-11-9
 * @Modified:
 */
@RestController
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @GetMapping(value = {"/hello","hi"})
    public String say() {

        return "hello world 123"+girlProperties.getCupSize();
    }
}
