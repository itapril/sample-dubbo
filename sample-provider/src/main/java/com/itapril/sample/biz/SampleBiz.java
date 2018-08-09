package com.itapril.sample.biz;

import com.itapril.sample.common.utils.CharUtils;
import com.itapril.sample.dao.DaoSupport;
import com.itapril.sample.po.SampleEntity;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author itapril.
 * @create 2018/8/8 17:27.
 */
@Component("sampleBiz")
public class SampleBiz {
    @Resource(name = "daoSupport")
    private DaoSupport dao;


    public List<SampleEntity> list(SampleEntity entity) throws Exception {
        return (List<SampleEntity> ) dao.findForList("SampleMapper.list", entity);
    }

    public Integer addSample(SampleEntity entity) throws Exception{
        entity.setUuid(CharUtils.setUUid());
        entity.setCreateTime(new Date());
        entity.setUpdateTime(new Date());
        return (Integer) dao.save("SampleMapper.addSample", entity);
    }

}
