package com.stark.springbootconfigrescope.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class RefreshScopeDemoController {

    @Value("${welcome}")
    String configValue;

    @RequestMapping(value = "/")
    public String getConfigValue() {
        return configValue;
    }

}
