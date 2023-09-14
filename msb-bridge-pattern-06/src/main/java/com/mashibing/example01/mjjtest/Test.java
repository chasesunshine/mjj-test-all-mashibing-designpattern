package com.mashibing.example01.mjjtest;

import com.mashibing.example01.mjjtest.payMethod.MimaMethod;
import com.mashibing.example01.mjjtest.payMethod.ZhiwenMethod;
import com.mashibing.example01.mjjtest.paychannel.PayChannel;
import com.mashibing.example01.mjjtest.paychannel.WeixinChannel;
import com.mashibing.example01.mjjtest.paychannel.ZhifubaoChannel;

public class Test {
    public static void main(String[] args) {
        PayChannel payChannel1 = new WeixinChannel();
        payChannel1.doPay(null,null,null,new MimaMethod());

        PayChannel payChannel2 = new ZhifubaoChannel();
        payChannel2.doPay(null,null,null,new ZhiwenMethod());
    }
}
