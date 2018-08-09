package com.itapril.sample.schedule;

import com.itapril.sample.common.utils.PropertiesLoader;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author itapril.
 * @create 2018/8/8 17:22.
 */
@Component(value="testSchedule")
@PropertySource("classpath:config.properties")
public class TestSchedule {

    protected Logger logger = Logger.getLogger(this.getClass());
    PropertiesLoader loader = new PropertiesLoader("config.properties");

    @Scheduled(cron="${schedule.test.interval}")
    public void runTest(){
        logger.info("schedule working ......");
        String t = loader.getProperty("dubbo.port");
        System.out.println("--->" + t);
    }

}
