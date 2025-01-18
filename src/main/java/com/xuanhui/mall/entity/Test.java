package com.xuanhui.mall.entity;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    /**
     * 蓝牙异常 代码 id
     */
    private Long id;

    /**
     * 异常代码
     */
    private String code;

}