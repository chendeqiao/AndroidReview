package com.nan.androidreview.designpattern.chain;

public class ConcreteHandler3 extends Handler {
    @Override
    protected int getHandlerLevel() {
        return 3;
    }

    @Override
    protected Response doSomething(Request request) {
        return new Response(this.getClass().getSimpleName() + "处理了" + request.getRequest());
    }
}
