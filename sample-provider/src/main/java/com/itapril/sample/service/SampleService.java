package com.itapril.sample.service;

import com.github.pagehelper.PageHelper;
import com.itapril.sample.api.vo.bean.PageBean;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.biz.SampleBiz;
import com.itapril.sample.po.SampleEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author itapril.
 * @create 2018/8/9 10:41.
 */
@Service("sampleService")
public class SampleService {

    @Resource(name="sampleBiz")
    private SampleBiz sampleBiz;

    public PageBean<SampleEntity>  list(SampleVO sampleVO) throws Exception{
        SampleEntity entity = new SampleEntity().voToEntity(sampleVO);
        PageHelper.startPage(sampleVO.getPageNum(), sampleVO.getPageSize());
        List<SampleEntity> list =  sampleBiz.list(entity);
        PageBean<SampleEntity> page = new PageBean<SampleEntity>(list);
        return page;
    }

    public Integer addSample(SampleVO sampleVO) throws Exception {
        SampleEntity entity = new SampleEntity().voToEntity(sampleVO);
        Integer code =  sampleBiz.addSample(entity);
        // 测试事务管理  模拟异常产生
//        int test = 1/0;
        return code;
    }

}
