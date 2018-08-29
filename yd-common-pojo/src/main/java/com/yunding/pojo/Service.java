package com.yunding.pojo;

import java.io.Serializable;
import java.util.Date;

public class Service implements Serializable {
    private Integer id;

    private String name;

    private String desc;

    private Integer serviceType;

    private Integer priceType;

    private Integer appId;

    private Date createTime;

    private Date updateTime;

    private String serviceOauth;

    private Byte status;

    private Integer hotNum;

    private Integer dUId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
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

    public String getServiceOauth() {
        return serviceOauth;
    }

    public void setServiceOauth(String serviceOauth) {
        this.serviceOauth = serviceOauth == null ? null : serviceOauth.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getHotNum() {
        return hotNum;
    }

    public void setHotNum(Integer hotNum) {
        this.hotNum = hotNum;
    }

    public Integer getdUId() {
        return dUId;
    }

    public void setdUId(Integer dUId) {
        this.dUId = dUId;
    }
}