package com.spider.monitorSystem.controller;

import com.spider.monitorSystem.service.JobInfoService;
import com.spider.monitorSystem.vo.JobInfoEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Resource
    private JobInfoService jobInfoService;


    @GetMapping("/test")
    @ResponseBody
    public List<JobInfoEntity> getTest(){
        List<JobInfoEntity> allJobs = jobInfoService.getAllJob();
        return allJobs;
    }
}
