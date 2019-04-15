package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.City;

import java.util.List;

/**
 * Copyright (C)，XX
 * FileName: DruidConfig
 * Author: zl
 * Date: 2019/2/14  21:36
 * Description: dao
 **/
public interface CityDao {

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID，获取城市信息
     *
     * @param id
     * @return
     */
    City findById(@Param("id") int id);

    int saveCity(City city);

    int updateCity(City city);

    int deleteCity(int id);
}
