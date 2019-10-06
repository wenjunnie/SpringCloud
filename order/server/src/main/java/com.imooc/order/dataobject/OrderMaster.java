package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 16:51
 */
@Data
@Entity
public class OrderMaster {
    @Id
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;//0新下单
    private Integer payStatus;//0未支付
    private Date createTime;
    private Date updateTime;
}
