package com.coder.dream.reference;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.inject.Singleton;
import service.Ai;

/**
 * Created by konghang on 2016/12/27.
 */
@Singleton
public class B {

    @Reference
    private Ai ai;

    @Reference(version = "1.0.1")
    private Ai ai2;

    public void say(){
        System.out.print("B:");
        ai.say();
        ai2.say();
    }
}
