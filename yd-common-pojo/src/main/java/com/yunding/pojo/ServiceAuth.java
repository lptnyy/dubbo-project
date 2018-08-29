package com.yunding.pojo;

import java.io.Serializable;
import java.util.Date;

public class ServiceAuth implements Serializable {
    private Integer id;

    private Integer serviceId;

    private Byte status;

    private Byte examinedesc;

    private Integer pUId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getExaminedesc() {
        return examinedesc;
    }

    public void setExaminedesc(Byte examinedesc) {
        this.examinedesc = examinedesc;
    }

    public Integer getpUId() {
        return pUId;
    }

    public void setpUId(Integer pUId) {
        this.pUId = pUId;
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