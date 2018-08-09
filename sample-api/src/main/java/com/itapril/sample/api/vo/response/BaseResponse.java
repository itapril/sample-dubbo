package com.itapril.sample.api.vo.response;

import com.itapril.sample.api.vo.bean.PageBean;

import java.util.Date;

/**
 * @author itapril.
 * @create 2018/8/9 14:01.
 */
public class BaseResponse {
    protected String uuid;

    protected Date createTime;

    protected Date updateTime;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
