package com.itapril.sample.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author itapril.
 * @create 2018/8/8 17:22.
 */
public class BaseEntity implements Serializable {
    private String uuid;

    private Date createTime;

    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
