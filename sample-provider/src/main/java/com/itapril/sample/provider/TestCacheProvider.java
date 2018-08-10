package com.itapril.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ITestCacheService;
import com.itapril.sample.api.vo.bean.PageBean;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.api.vo.response.SampleResponse;
import com.itapril.sample.service.SampleService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author itapril.
 * @create 2018/8/10 10:59.
 */
@Component(value="testCacheProvider")
@Service(version="1.0.0", protocol="dubbo",timeout=1200000, cache = "lru")
public class TestCacheProvider implements ITestCacheService {

    public static final Logger logger = Logger.getLogger(TestCacheRestProvider.class);

    @Resource(name="sampleService")
    private SampleService sampleService;

    @Override
    public ResultResponse list(SampleVO sampleVO) {
        logger.info("----------------");
        ResultResponse result = new ResultResponse();
        try {
            PageBean<SampleResponse> pageList =  sampleService.list(sampleVO);
            result.setSuccess("查询成功", pageList);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.getMessage());
        }
        return result;
    }

    @Override
    public ResultResponse addSample(SampleVO vo) {
        logger.info("----------------");
        ResultResponse result = new ResultResponse();
        try {
            Integer code = sampleService.addSample(vo);
            result.setSuccess("添加成功", code);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.getMessage());
        }
        return result;
    }

    @Override
    public ResultResponse updateSample(SampleVO vo) {
        logger.info("----------------");
        ResultResponse result = new ResultResponse();
        try {
            Integer code = sampleService.updateSample(vo);
            result.setSuccess("更新成功", code);
        } catch (Exception e) {
            e.printStackTrace();
            result.setError(e.getMessage());
        }
        return result;
    }
}
