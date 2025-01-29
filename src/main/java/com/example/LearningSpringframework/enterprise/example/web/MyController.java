package com.example.LearningSpringframework.enterprise.example.web;

import com.example.LearningSpringframework.enterprise.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyController {
    @Autowired
    private BusinessService businessService;

    public Long returnValuefromBusinessService() {
        return businessService.calculateSum();

    }
}




