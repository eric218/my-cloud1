package cn.wimetro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping(value = "serviceA")
public class ServiceA2Controller {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "hello:testA2";
    }
}
