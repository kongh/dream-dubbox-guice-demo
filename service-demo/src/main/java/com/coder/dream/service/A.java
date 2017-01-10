package com.coder.dream.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.google.inject.Singleton;
import service.Ai;

/**
 * Created by konghang on 2016/12/15.
 */
@Singleton
@Service(application = "konghang")
public class A implements Ai {

    @Override
    public void say() {
        System.out.println("I am Ai versioned none version.");
    }
}
