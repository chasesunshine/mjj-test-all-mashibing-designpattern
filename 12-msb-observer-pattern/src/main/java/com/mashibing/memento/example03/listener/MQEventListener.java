package com.mashibing.memento.example03.listener;

import com.mashibing.memento.example02.LotteryResult;

/**
 * MQ消息发送事件监听
 * @author spikeCong
 * @date 2022/10/12
 **/
public class MQEventListener implements EventListener{

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户的摇号结果(MQ),用户ID: " + result.getUId()
        + ",摇号结果: " + result.getMsg());
    }
}
