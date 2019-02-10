package com.market.controller;

import com.market.config.LogInfo;
import com.market.config.ServerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private ServerInfo serverInfo;

    @Autowired
    private LogInfo logInfo;

    @Value("#{serverInfo.ip}")
    private String ip;

    @Value("${spring.profiles.active}")
    private String profile;

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping(value = "/login/{id}/{name}", method = RequestMethod.GET)
    public String login(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        validate(id, name);
        logger.info("=======================INFO");
        logger.error("=======================ERROR");
        logger.warn("=======================WARN");
        return "login: " + id + ", " + name + ", path: " + logInfo.getPath();
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
        // TODO
        return "logout: " + id;
    }

    private void validate(Integer id, String name) {
        System.out.println("id" + id);
        System.out.println("name" + name);
    }
}
