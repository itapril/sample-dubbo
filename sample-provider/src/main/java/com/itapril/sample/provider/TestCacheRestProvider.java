package com.itapril.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ITestCacheRestService;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.service.SampleService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author itapril.
 * @create 2018/8/10 11:02.
 */
@Path("cache")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service(version="1.0.0", protocol="rest", validation="true")
@Component(value="testCacheRestProvider")
public class TestCacheRestProvider implements ITestCacheRestService {

    public static final Logger logger = Logger.getLogger(TestCacheRestProvider.class);


    @Resource
    private TestCacheProvider cacheProvider;

    @Path("list")
    @POST
    @Override
    public ResultResponse list(@RequestBody SampleVO request) {
        logger.info("----------------");
        return cacheProvider.list(request);
    }

    @Path("addSample")
    @POST
    @Override
    public ResultResponse addSample(@RequestBody SampleVO vo) {
        logger.info("----------------");
        return cacheProvider.addSample(vo);
    }

    @Path("updateSample")
    @POST
    @Override
    public ResultResponse updateSample(@RequestBody SampleVO vo) {
        logger.info("----------------");
        return cacheProvider.updateSample(vo);
    }
}
