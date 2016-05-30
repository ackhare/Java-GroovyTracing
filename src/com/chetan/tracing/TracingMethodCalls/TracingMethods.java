package com.chetan.tracing.TracingMethodCalls;

/**
 * Created by chetan on 30/5/16.
 */
public class TracingMethods {
    static void inner() {
        StackTracer.printStackTrace();
    }
    static void middle() {
        inner();
    }
    static void outer() {
        middle();
    }
    public static void main(String[] args) {
        outer();
    }
}
