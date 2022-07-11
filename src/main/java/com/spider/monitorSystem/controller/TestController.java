package com.spider.monitorSystem.controller;

import com.spider.monitorSystem.service.JobDetailService;
import com.spider.monitorSystem.service.JobInfoService;

import com.spider.monitorSystem.vo.JobDetailVo;
import com.spider.monitorSystem.vo.JobInfoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xwb
 */
@Api("接口")
@Controller
public class TestController {
    @Resource
    private JobInfoService jobInfoService;
    @Resource
    private JobDetailService jobDetailService;

    @ApiOperation(value = "返回所有任务信息")
    @PostMapping("/getJobs")
    @ResponseBody
    public List<JobInfoEntity> getAllJobs() {
        List<JobInfoEntity> allJobs = jobInfoService.getAllJob();
        return allJobs;
    }

    @ApiOperation("给出任务id，查找对应任务的开始时间，结束时间，指标,没查到返回null")
    @PostMapping("/getJD")
    @ResponseBody
    @ApiParam(name = "jobId", value = "形如：standard或者jp_umin_daily")
    public JobDetailVo getJobDetail(@ApiParam(name = "jobId", value = "形如：standard或者jp_umin_daily")
                                    @RequestParam(value = "jobId", required = true) String jobId) {
        JobDetailVo jobDetail = jobDetailService.getJobDetail(jobId);
        return jobDetail;
    }
}
