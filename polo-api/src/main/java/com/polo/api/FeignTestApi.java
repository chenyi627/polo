package com.polo.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.polo.clientproxy.SpringCloudClient;
import com.polo.core.dao.PersonDao;
import com.polo.core.domain.Member;
import com.polo.core.domain.Person;
import com.polo.core.mapper.PersonMapper;
import com.polo.core.service.MemberService;
import com.polo.core.service.iml.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * Created by POLO on 2016/11/19.
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignTestApi {


    @Autowired
    MemberService memberService;

    @Autowired
    PersonService personService;

    @Autowired
    SpringCloudClient springCloudClient;


    @RequestMapping(value = "/add" ,method = {RequestMethod.GET,RequestMethod.POST})
    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "600000")
    })
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer add(){
            Person person = personService.findById(1l);
            String result = springCloudClient.add(1);
            return 1;
    }


}
