package com.example.server.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "serverService", contextId = "TestServicesApis")
public interface TestServicesApis {
    @RequestMapping("/test/get")
    public String get(@RequestParam(value = "name") String name);
}
