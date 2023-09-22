package com.mashibing.memento.example01;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发起人角色
 * @author spikeCong
 * @date 2022/10/19
 **/
@Data
@NoArgsConstructor
public class Originator {

    private String state = "原始对象";

    private String id;

    private String name;

    private String phone;

    //创建备忘录对象
    public Memento createMemento(){
        return new Memento(id,name,phone);
    }

    //恢复对象
    public void restoreMemento(Memento m){

        this.state = m.getState();
        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
