package com.example.feign;

import org.springframework.stereotype.Component;

/**
 * @author liu
 */
@Component
public class FeignServiceHystric implements FeignService {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
