package com.coder.dream.reference;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Created by konghang on 2017/1/10.
 */
@Singleton
public class TestB {

    @Inject
    public TestB(B b) {
        b.say();
    }
}
