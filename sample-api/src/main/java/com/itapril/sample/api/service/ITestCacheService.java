package com.itapril.sample.api.service;

import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.vo.request.SampleVO;

/**
 * @author itapril.
 * @create 2018/8/10 11:03.
 */
public interface ITestCacheService {
    ResultResponse list(SampleVO vo);
    ResultResponse addSample(SampleVO vo);
    ResultResponse updateSample(SampleVO vo);
}
