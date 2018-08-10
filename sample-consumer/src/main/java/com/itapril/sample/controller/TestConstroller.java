package com.itapril.sample.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ISampleService;
import com.itapril.sample.api.service.ITestCacheService;
import com.itapril.sample.api.vo.request.SampleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author itapril.
 * @create 2018/8/9 09:03.
 */
@Controller
public class TestConstroller {

    /**
     * 当使用 Reference 注解时，dubbo的事件通知不生效   why ???
     */
//    @Reference(version = "1.0.0")
    @Autowired
    private ISampleService sampleService;
//    @Reference(version = "1.0.0")
    @Autowired
    private ITestCacheService cacheService;

    @RequestMapping(value = "/testCache", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse testCache(@RequestBody SampleVO vo){
        System.out.println("begin...");
//        SampleVO vo = new SampleVO();
        ResultResponse response = cacheService.list(vo);
        return response;
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public ResultResponse list(@RequestBody SampleVO vo){
        System.out.println(" list begin...");
        ResultResponse response = sampleService.list(vo);
        return response;
    }

}
