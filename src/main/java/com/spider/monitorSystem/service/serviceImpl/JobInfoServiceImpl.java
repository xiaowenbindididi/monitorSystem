package com.spider.monitorSystem.service.serviceImpl;

import com.spider.monitorSystem.dao.JobInfoDao;
import com.spider.monitorSystem.service.JobInfoService;
import com.spider.monitorSystem.utils.SortUtils;
import com.spider.monitorSystem.vo.JobInfoEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobInfoServiceImpl implements JobInfoService {
    @Resource
    private JobInfoDao jobInfoDao;
    @Resource
    private SortUtils sortUtils;

    @Override
    public List<JobInfoEntity> getAllJob() {
        List<JobInfoEntity> jobInfoList = jobInfoDao.selectAllJobs();
        if (jobInfoList != null && jobInfoList.size() > 0) {
            jobInfoList = sortUtils.sortJobInfoList(jobInfoList);
        }
        return jobInfoList;
    }
}
