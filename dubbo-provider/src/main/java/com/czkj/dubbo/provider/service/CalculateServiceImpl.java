package com.czkj.dubbo.provider.service;
import com.alibaba.dubbo.config.annotation.Service;
import com.czkj.dubbo.api.service.CalculateService;
/**
 * @Author steven.sheng
 * @Date 2020/3/17/01715:15
 */
public class CalculateServiceImpl implements CalculateService {
    /**
     * 加法接口 返回 a+b
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public Integer add(Integer a, Integer b) {
        if(a==null||b==null){
            return null;
        }
        return a+b;
    }
}
