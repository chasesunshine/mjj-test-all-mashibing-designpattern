package com.mashibing.strategy.example02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 回执信息
 * @author spikeCong
 * @date 2022/10/13
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {

    private String message; //回执内容

    private String type; //回执类型: MT1101、MT2101、MT4101、MT8104
}
