package com.polo.clientproxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by POLO on 2016/11/19.
 */
@FeignClient(name ="POLO-CLOUD-SERVICE")
public interface SpringCloudClient {

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    String add(@RequestParam("a") Integer a) ;

}
