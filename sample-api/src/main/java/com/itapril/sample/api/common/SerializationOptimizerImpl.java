package com.itapril.sample.api.common;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author itapril.
 * @create 2018/8/9 09:33.
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
    public SerializationOptimizerImpl() {
    }

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList();
        classes.add(ResultResponse.class);
        return classes;
    }
}
