package com.itapril.sample.main;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itapril.sample.api.common.ResultResponse;
import com.itapril.sample.api.service.ISampleService;
import com.itapril.sample.api.vo.bean.PageBean;
import com.itapril.sample.api.vo.request.SampleVO;
import com.itapril.sample.api.vo.response.SampleResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author itapril.
 * @create 2018/8/9 13:20.
 */
@Component
public class TestMain {
    /*@Reference(version = "1.0.0")
    private ISampleService sampleService;

    public void test(){
        SampleVO vo = new SampleVO();
        ResultResponse response = sampleService.list(vo);
        PageBean object = (PageBean) response.getResult();
        List<SampleResponse> list = object.getList();
        System.out.println("--- >　>  >" + object);
        System.out.println("--- >　>  >" + list);
    }*/

    public static void main(String[] args) {
        ClassPathXmlApplicationContext pathXmlApplicationContext=new ClassPathXmlApplicationContext("spring/sample-consumer.xml");
        ISampleService sampleService = (ISampleService) pathXmlApplicationContext.getBean("sampleService");
        for ( int i=0; i<10; i++){
            SampleVO vo = new SampleVO();
            ResultResponse response = sampleService.list(vo);
            System.out.println("-----> " + response);
        }

       /* TestMain bean = pathXmlApplicationContext.getBean(TestMain.class);

        bean.test();*/
        System.exit(0);
    }
}
