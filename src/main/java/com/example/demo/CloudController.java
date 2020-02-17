package com.example.demo;

import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * CloudController
 */
@RestController
@Profile("cloud")
public class CloudController {

    @GetMapping(value="/cloud")
    public String getMethodName(@RequestParam String param) {
        ApplicationInstanceInfo applicationInstanceInfo = new CloudFactory().getCloud().getApplicationInstanceInfo();
        switch (param) {
            case "app":
               return applicationInstanceInfo.getAppId();
            case "instance":
                return applicationInstanceInfo.getInstanceId();
            case "props":
                return applicationInstanceInfo.getProperties().keySet().toString();
            default:
                return new String();
        }
    }
    
}