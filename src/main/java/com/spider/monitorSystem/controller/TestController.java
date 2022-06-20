package com.spider.monitorSystem.controller;

import com.spider.monitorSystem.service.JobInfoService;
import com.spider.monitorSystem.utils.SortUtils;
import com.spider.monitorSystem.vo.JobInfoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
@Api("接口")
@Controller
public class TestController {
    @Resource
    private JobInfoService jobInfoService;

    @ApiOperation(value = "返回所有任务信息")
    @PostMapping("/test")
    @ResponseBody
    public List<JobInfoEntity> getTest(){
        List<JobInfoEntity> allJobs = jobInfoService.getAllJob();
        return allJobs;
    }
}
