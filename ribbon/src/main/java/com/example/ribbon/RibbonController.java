package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liu
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService hiService;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return hiService.hiService(name);
    }

}
