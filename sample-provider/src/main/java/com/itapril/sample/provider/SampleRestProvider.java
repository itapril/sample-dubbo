package com.itapril.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ISampleRestService;
import com.itapril.sample.api.vo.request.SampleVO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @author itapril.
 * @create 2018/8/8 17:24.
 */
@Path("sample")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Service(version="1.0.0", protocol="rest", validation="true")
@Component(value="sampleRestProvider")
public class SampleRestProvider implements ISampleRestService {

    @Resource
    private SampleProvider sampleProvider;

    @Path("list")
    @POST
    @Override
    public ResultResponse list(@RequestBody SampleVO request) {
        return sampleProvider.list(request);
    }

    @Path("addSample")
    @POST
    @Override
    public ResultResponse addSample(SampleVO vo) {
        return sampleProvider.addSample(vo);
    }
}
