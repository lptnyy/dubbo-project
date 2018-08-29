package com.yunding.pojo;

import java.io.Serializable;
import java.util.Date;

public class DUserAuth implements Serializable {
    private Integer id;

    private String contacts;

    private Integer phone;

    private String email;

    private String cardPos;

    private String cardBack;

    private String aptitude;

    private Date createTime;

    private Date updateTime;

    private Integer dUId;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCardPos() {
        return cardPos;
    }

    public void setCardPos(String cardPos) {
        this.cardPos = cardPos == null ? null : cardPos.trim();
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack == null ? null : cardBack.trim();
    }

    public String getAptitude() {
        return aptitude;
    }

    public void setAptitude(String aptitude) {
        this.aptitude = aptitude == null ? null : aptitude.trim();
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

    public Integer getdUId() {
        return dUId;
    }

    public void setdUId(Integer dUId) {
        this.dUId = dUId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}