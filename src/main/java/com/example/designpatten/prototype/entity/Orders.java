package com.example.designpatten.prototype.entity;

public class Orders implements Cloneable {
    private Integer autoId;

    private String appId;

    private String appToken;

    private Integer id;

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public Orders clone() throws CloneNotSupportedException {
        return (Orders)super.clone();
    }
}