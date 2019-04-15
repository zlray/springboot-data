package org.spring.springboot.domain;

import java.io.Serializable;

/**
 * 城市实体类
 *
 *  * Copyright (C)，XX
 *  * FileName: DruidConfig
 *  * Author: zl
 *  * Date: 2019/2/14  21:36
 *  * Description: 实体类
 */
public class City implements Serializable {

    private static final long serialVersionUID = -1L;

    /**
     * 城市编号
     */
    private int id;

    /**
     * 省份编号
     */
    private int provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
        private String description;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", provinceId=" + provinceId +
                ", cityName='" + cityName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
