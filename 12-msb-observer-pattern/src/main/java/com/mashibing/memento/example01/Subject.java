package com.mashibing.memento.example01;

/**
 * 抽象目标类 - 抽象被观察者
 * @author spikeCong
 * @date 2022/10/11
 **/
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
