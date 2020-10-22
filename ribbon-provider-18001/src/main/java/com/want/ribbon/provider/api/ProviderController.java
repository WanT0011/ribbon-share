package com.want.ribbon.provider.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author want
 * @createTime 2020.10.22.21:28
 */
@RestController
@RequestMapping("provider")
public class ProviderController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("whoAreU")
    public String whoAreU(){
        return instanceId;
    }
}
