package com.mac.limitsservice;

import com.mac.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        //return new LimitConfiguration(1000, 1);
        LimitConfiguration limitConfiguration = new LimitConfiguration();
        limitConfiguration.setMaximum(configuration.getMaximum());
        limitConfiguration.setMinimum(configuration.getMinimum());
        return limitConfiguration;
    }
}
