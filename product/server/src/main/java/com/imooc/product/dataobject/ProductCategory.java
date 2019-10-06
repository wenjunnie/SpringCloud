package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: wenjun
 * @Date: 2019/9/18 21:35
 */
@Data
@Entity
public class ProductCategory {
    @Id
    @GeneratedValue//自增
    private Integer categoryId;
    private String categoryName;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
