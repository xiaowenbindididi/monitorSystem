package com.spider.monitorSystem.service;


import com.spider.monitorSystem.vo.JobInfoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobInfoService {
    List<JobInfoEntity> getAllJob();
}
