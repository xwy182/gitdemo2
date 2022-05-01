package com.kgc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/show1.do")
    public String test(Map<String,Object>map){
        map.put("mm","我是master");

        return "index";
    }
}
