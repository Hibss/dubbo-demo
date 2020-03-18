package com.czkj.dubbo.api.service;

/**
 * @Author steven.sheng
 * @Date 2020/3/17/01711:51
 */
public interface CalculateService {

    /**
     * 加法接口 返回 a+b
     * @param a
     * @param b
     * @return
     */
    Integer add(Integer a, Integer b);
}
