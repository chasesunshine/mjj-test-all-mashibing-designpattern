package com.mashibing.state.example01;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 上下文类
 * @author spikeCong
 * @date 2022/10/17
 **/
@Data
@AllArgsConstructor
public class Context {

    //维持一个对状态对象的有引用
    private State currentState;

    public Context() {
        this.currentState = null;
    }

    @Override
    public String toString() {
        return "Context{currentState=" + currentState + '}';
    }
}
