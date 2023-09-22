package com.mashibing.memento.example03.listener;

import com.mashibing.memento.example02.LotteryResult;

/**
 * 事件监听接口
 * @author spikeCong
 * @date 2022/10/12
 **/
public interface EventListener {

    void doEvent(LotteryResult result);
}
