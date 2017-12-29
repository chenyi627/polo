package com.polo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cy
 * @version $Id: RibbonTestApi, v0.1 21年11月21日 18:02 cy Exp $
 */
@RestController
@RequestMapping(value = "/ribbon")
public class RibbonTestApi {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return restTemplate.getForEntity("http://POLO-CLOUD-SERVICE/add?a=1", String.class).getBody();
    }

}
