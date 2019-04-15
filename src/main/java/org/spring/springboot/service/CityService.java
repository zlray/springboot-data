package org.spring.springboot.service;

import org.spring.springboot.domain.City;

import java.util.List;

/**
 * Copyright (C)，XX
 * FileName: DruidConfig
 * Author: zl
 * Date: 2019/2/14  21:36
 * Description: city逻辑接口
 **/
public interface CityService {
    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    City findCityById(int id);

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    int saveCity(City city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     */
    int updateCity(City city);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    int deleteCity(int id);
}
