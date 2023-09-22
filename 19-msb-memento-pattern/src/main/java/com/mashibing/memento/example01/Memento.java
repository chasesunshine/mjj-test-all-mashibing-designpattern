package com.mashibing.memento.example01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录角色
 *      访问权限为: 默认,在同包下可见(尽量保证只有发起者类可以访问备忘录类)
 * @author spikeCong
 * @date 2022/10/19
 **/
@NoArgsConstructor
@Data
class Memento {

    private String state = "从备份对象恢复原始对象";

    private String id;

    private String name;

    private String phone;

    public Memento(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
