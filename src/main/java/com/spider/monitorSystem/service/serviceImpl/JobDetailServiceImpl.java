package com.spider.monitorSystem.service.serviceImpl;

import com.spider.monitorSystem.dao.JobDetailDao;
import com.spider.monitorSystem.service.JobDetailService;
import com.spider.monitorSystem.vo.JobDetailVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JobDetailServiceImpl implements JobDetailService {
    @Resource
    private JobDetailDao jobDetailDao;

    @Override
    public JobDetailVo getJobDetail(String jobId) {
        if (jobId != null && jobId.length() > 0) {
            JobDetailVo jobDetail = jobDetailDao.getJobDetail(jobId);
            return jobDetail;
        } else {
            return null;
        }
    }
}
