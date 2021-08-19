package com.example.web.controller;

import com.example.server.api.TestServicesApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {
    @Autowired
    private TestServicesApis testServicesApis;

    @Value("${aa.bb}")
    String value;

    @RequestMapping("/getTest")
    public String getTest() {
        return testServicesApis.get("通过web调用的");
    }
    @RequestMapping("/value")
    public String getValue(){
        return "value:" + value;
    }
}
