package com.czkj.dubbo.consumer.controller;

import com.czkj.dubbo.api.service.CalculateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author steven.sheng
 * @Date 2020/3/17/01715:22
 */
@RestController
@Slf4j
public class CalculateController {

    @Autowired
    private CalculateService calculateService;

    @GetMapping("calculate/add")
    public Integer add(@RequestParam("a")Integer a,@RequestParam("b")Integer b){
        Integer result = calculateService.add(a,b);
        log.info("add A:{} B:{} result:{}",a,b,result);
        return result;
    }
}
