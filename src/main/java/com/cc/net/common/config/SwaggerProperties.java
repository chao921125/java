package com.cc.net.common.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("swagger")
public class SwaggerProperties {
    /**
     * 是否开启swagger，生产环境一般关闭，所以这里定义一个变量
     */
    private Boolean enable;
    /**
     * 项目应用名
     */
    private String applicationName;
    /**
     * 项目版本信息
     */
    private String applicationVersion;
    /**
     * 项目描述信息
     */
    private String applicationDescription;
    /**
     * 接口调试地址
     */
    private String tryHost;

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public void setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    public void setTryHost(String tryHost) {
        this.tryHost = tryHost;
    }
}
