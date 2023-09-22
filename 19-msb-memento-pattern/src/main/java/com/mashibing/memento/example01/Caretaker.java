package com.mashibing.memento.example01;

import lombok.Data;

/**
 * 负责人类-获取和保存备忘录对象
 * @author spikeCong
 * @date 2022/10/19
 **/
@Data
public class Caretaker {
    private Memento memento;
}
