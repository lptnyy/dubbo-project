package com.yunding.web.parameter;

import com.yunding.util.annotation.check.IsNotNull;

public class Add {
    @IsNotNull(message = "不允许为空")
    String name;
    String jsonp;
    public String getName() {
        return name;
    }

    public String getJsonp() {
        return jsonp;
    }

    public void setJsonp(String jsonp) {
        this.jsonp = jsonp;
    }

    public void setName(String name) {
        this.name = name;
    }
}
