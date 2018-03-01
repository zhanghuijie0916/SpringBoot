package org.sunny.meng.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "org.sunny")
@PropertySource("classpath:config/myconfig.properties")
public class ConfigBean {
    @Value("${org.sunny.language}")
    private String language;

    private String title;
    private Double flag;
    private Integer index;//采用自定义的myconfig.properties文件定义属性

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getFlag() {
        return flag;
    }

    public void setFlag(Double flag) {
        this.flag = flag;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ConfigBean{" +
                "language='" + language + '\'' +
                ", title='" + title + '\'' +
                ", flag=" + flag +
                ", index=" + index +
                '}';
    }
}
