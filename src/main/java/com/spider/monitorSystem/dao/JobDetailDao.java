package com.spider.monitorSystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spider.monitorSystem.vo.JobDetailVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobDetailDao extends BaseMapper<JobDetailVo> {
    JobDetailVo getJobDetail(String jobId);
}
