package com.itapril.sample.event.impl;

import com.itapril.sample.api.common.utils.JsonUtil;
import com.itapril.sample.event.IEventNotify;

/**
 * @author itapril.
 * @create 2018/8/10 17:39.
 */
public class EventNotifyImpl implements IEventNotify {
     /*
    Cannot create inner bean 'sampleService.list'
    of type [com.alibaba.dubbo.config.MethodConfig] while setting bean property 'methods' with key [0];
    nested exception is org.springframework.beans.factory.BeanCreationException:
    Error creating bean with name 'sampleService.list':
    Cannot resolve reference to bean 'notify.oninvoke' while setting bean property 'oninvoke';
    nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'notify.oninvoke' is defined

     */
   /* @Override
    public void oninvoke(Object res, Object... args) {
        System.out.println("测试======");
    }*/

    public void onreturn(Object res, Object... args) {
        System.out.println("返回值："+ JsonUtil.toJsonString(res));
        for (Object object : args) {
            System.out.println("参数："+object);
        }
    }

    public void onthrow(Throwable ex, Object... args) {
        System.out.println("异常："+ex.getMessage());
        for (Object object : args) {
            System.out.println("异常参数："+object);
        }
    }
}
