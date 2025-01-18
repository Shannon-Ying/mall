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

    /**
     * 原因
     */
    private String reason;

    /**
     * 解决方式
     */
    private String solution;

    /**
     * 语言码
     */
    private String languageCode;

    private String codeDesc;
}