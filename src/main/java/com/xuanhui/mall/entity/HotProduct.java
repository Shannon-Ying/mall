package com.xuanhui.mall.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 产品表
 * hot_product
 */
@Data
public class HotProduct implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 副标题
     */
    private String subTitle;

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 品牌ID
     */
    private Long brandId;

    /**
     * 品类ID
     */
    private Long spgId;

    /**
     * 是否上架
     */
    private Boolean saleable;

    /**
     * 是否有效
     */
    private Boolean valid;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;
}