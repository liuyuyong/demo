package com.example.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
