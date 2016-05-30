package com.chetan.tracing.TracingExecution;

import com.chetan.tracing.TracingExecution.LogUtils;

/**
 * Created by chetan on 30/5/16.
 */

class Test {
    public void doit() {
        System.out.println("*Howto Trace only 1 level\n" + LogUtils.getStack(1));
        System.out.println("*Howto Trace only 10 levels\n" + LogUtils.getStack(10));
        System.out.println("*Howto Trace no level (current)\n" + LogUtils.getStack(0));
    }
}