package com.fengwenyi.springsecuritydemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Erwin Feng
 * @since 2019-05-29 23:03
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
