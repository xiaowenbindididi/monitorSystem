package com.spider.monitorSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public Map<String,Object> getTest(){
        Map<String,Object> map=new LinkedHashMap<>();
        System.out.println("test");
        map.put("name","text");
        return map;
    }
}
