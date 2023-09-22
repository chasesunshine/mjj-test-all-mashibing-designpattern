package com.mashibing.memento.example03.listener;

import com.mashibing.memento.example02.LotteryResult;

/**
 * 短信发送事件监听类
 * @author spikeCong
 * @date 2022/10/12
 **/
public class MessageEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知,用户ID: " + result.getUId()
        +",您的摇号结果为: " + result.getMsg());
    }
}
