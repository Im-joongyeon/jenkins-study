package com.study.jenkins.jib.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by I'm_joongyeon on 4/9/24.
 */

@RestController
@RequestMapping("/jenkins/study")
public class studyController {

    @GetMapping("/get")
    public String getRequest() {
        return "Ok";
    }

}
