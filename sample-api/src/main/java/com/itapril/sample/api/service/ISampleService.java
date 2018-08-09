package com.itapril.sample.api.service;

import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.vo.request.SampleVO;

/**
 * @author itapril.
 * @create 2018/8/9 10:48.
 */
public interface ISampleService {
    ResultResponse list(SampleVO vo);
    ResultResponse addSample(SampleVO vo);
}
