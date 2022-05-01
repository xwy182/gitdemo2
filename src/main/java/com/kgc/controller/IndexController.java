package com.kgc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("/show1.do")
    public String test(Map<String,Object>map){
        map.put("mm","我是1 ");

        return "index";
    }
    @RequestMapping("/show2.do")
    public String test1(Map<String,Object>map){
        map.put("mm","我是fenzhi ");

        return "index";
    }

    @RequestMapping("/show3.do")
    public String test3(Map<String,Object>map){
        map.put("mm","我是gengxin dongxi  ");

        return "index";
    }
    @RequestMapping("/show4.do")
    public String test4(Map<String,Object>map){
        map.put("mm","我是44 ");

        return "index";
    }
    @RequestMapping("/show5.do")
    public String test5(Map<String,Object>map){
        map.put("mm","我是5 ");

        return "index";
    }
    @RequestMapping("/show6.do")
    public String test6(Map<String,Object>map){
        map.put("mm","我是6 ");

        return "index";
    }
    @RequestMapping("/show7.do")
    public String test7(Map<String,Object>map){
        map.put("mm","我是7 ");

        return "index";
    }
    @RequestMapping("/show8.do")
    public String test8(Map<String,Object>map){
        map.put("mm","我是8 ");

        return "index";
    }
    @RequestMapping("/show9.do")
    public String test9(Map<String,Object>map){
        map.put("mm","我是9 ");

        return "index";
    }
}
