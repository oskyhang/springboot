package com.oskyhang.demo;

import org.springframework.stereotype.Component;

/**
 * description: 加载配置文件
 * author: Smile
 * date: 2017/4/8
 */
@Component
public class MyProperties {
    private String  cnName;
    private String engName;

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }
}
