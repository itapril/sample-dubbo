package com.itapril.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ISampleService;
import com.itapril.sample.api.vo.bean.PageBean;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.api.vo.response.SampleResponse;
import com.itapril.sample.po.SampleEntity;
import com.itapril.sample.service.SampleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author itapril.
 * @create 2018/8/8 17:23.
 */
@Component(value="sampleProvider")
@Service(version="1.0.0", protocol="dubbo",timeout=1200000)
public class SampleProvider implements ISampleService {

    @Resource(name="sampleService")
    private SampleService sampleService;

    @Override
    public ResultResponse list(SampleVO sampleVO) {
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

}
