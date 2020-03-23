package com.csu.mall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by lihao on 2020/3/22.
 */
@Data
public class Category {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;

}
