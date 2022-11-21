package com.blushyes.impl;

import com.blushyes.NewInterface;
import com.blushyes.OldInterface;

/**
 * 旧服务适配器
 */
public class OldServeAdapter implements NewInterface {
    public OldServeAdapter() {
    }

    public OldServeAdapter(OldInterface oldServe) {
        this.oldServe = oldServe;
    }

    private OldInterface oldServe;
    @Override
    public void newServe() {
        oldServe.oldServe();
    }
}
