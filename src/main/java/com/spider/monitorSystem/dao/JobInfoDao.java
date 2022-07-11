package com.spider.monitorSystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spider.monitorSystem.vo.JobInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JobInfoDao extends BaseMapper<JobInfoEntity> {
    List<JobInfoEntity> selectAllJobs();
}
