package com.itapril.sample.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itapril.sample.api.vo.bean.PageBean;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.api.vo.response.SampleResponse;
import com.itapril.sample.biz.SampleBiz;
import com.itapril.sample.po.SampleEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author itapril.
 * @create 2018/8/9 10:41.
 */
@Service("sampleService")
public class SampleService {
    public static final Logger logger = Logger.getLogger(SampleService.class);


    @Resource(name="sampleBiz")
    private SampleBiz sampleBiz;

    public PageBean<SampleResponse>  list(SampleVO sampleVO) throws Exception{
        logger.info(" ...... request list ...... ");
        SampleEntity entity = new SampleEntity().voToEntity(sampleVO);
        PageHelper.startPage(sampleVO.getPageNum(), sampleVO.getPageSize());
        List<SampleEntity> list =  sampleBiz.list(entity);
        List<SampleResponse> responseList = new ArrayList<>();
        /*for (SampleEntity temp : list) {
            SampleResponse response = new SampleResponse();
            BeanUtils.copyProperties(response, temp);
            responseList.add(response);
        }*/
       list.forEach(
                temp -> {
                   try {
                       SampleResponse response = new SampleResponse();
                       BeanUtils.copyProperties(response, temp);
                       responseList.add(response);
                   } catch (IllegalAccessException e) {
                       e.printStackTrace();
                   } catch (InvocationTargetException e) {
                       e.printStackTrace();
                   }
            }
        );
        PageBean<SampleEntity> pageList = new PageBean<>(list);
        PageBean<SampleResponse> page = new PageBean<>();
        page.setPageNum(pageList.getPageNum());
        page.setTotal(pageList.getTotal());
        page.setSize(pageList.getSize());
        page.setPages(pageList.getPages());
        page.setPageSize(pageList.getPageSize());
        page.setList(responseList);
        return page;
    }

    public Integer addSample(SampleVO sampleVO) throws Exception {
        logger.info(" ...... request addSample ...... ");
        SampleEntity entity = new SampleEntity().voToEntity(sampleVO);
        Integer code =  sampleBiz.addSample(entity);
        // 测试事务管理  模拟异常产生
//        int test = 1/0;
        return code;
    }

    public Integer updateSample(SampleVO sampleVO ) throws Exception {
        logger.info(" ...... request updateSample ...... ");
        SampleEntity entity = new SampleEntity().voToEntity(sampleVO);
        Integer code =  sampleBiz.updateSample(entity);
        // 测试事务管理  模拟异常产生
//        int test = 1/0;
        return code;
    }

}
