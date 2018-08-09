package com.itapril.sample.po;

import com.itapril.sample.api.vo.request.SampleVO;
import org.apache.commons.beanutils.BeanUtils;

/**
 * @author itapril.
 * @create 2018/8/8 17:27.
 */
public class SampleEntity extends BaseEntity {

    private static final long serialVersionUID = 3975508555784735314L;
    public SampleEntity(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SampleEntity voToEntity(SampleVO vo) throws Exception{
        if(vo == null) {
            return null;
        }
        SampleEntity entity = new SampleEntity();
        BeanUtils.copyProperties(entity, vo);
        return entity;
    }
}
