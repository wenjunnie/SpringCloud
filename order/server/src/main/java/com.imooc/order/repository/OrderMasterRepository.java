package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wenjun
 * @Date: 2019/9/19 16:58
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {
}
