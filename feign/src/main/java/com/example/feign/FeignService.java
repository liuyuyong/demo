package com.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = FeignServiceHystric.class)
public interface FeignService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name);
}
