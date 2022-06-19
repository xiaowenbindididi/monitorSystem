package com.spider.monitorSystem.service.serviceImpl;

import com.spider.monitorSystem.dao.JobInfoDao;
import com.spider.monitorSystem.service.JobInfoService;
import com.spider.monitorSystem.vo.JobInfoEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobInfoServiceImpl implements JobInfoService {
    @Resource
    private JobInfoDao jobInfoDao;

    @Override
    public List<JobInfoEntity> getAllJob() {
        List<JobInfoEntity> jobInfoList = jobInfoDao.selectAllJobs();
        return jobInfoList;
    }
}
