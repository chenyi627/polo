package com.polo.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述: todo
 * <p>
 * 作者: Administrator
 * 日期: 2017/12/27 0027 16:13
 */
@ControllerAdvice
public class MyControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 1000);
        map.put("msg", ex.getMessage());
        return map;
    }

}
