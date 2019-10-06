package com.imooc.user.repository;

import com.imooc.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wenjun
 * @Date: 2019/9/30 19:23
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {
    UserInfo findByOpenid(String openid);
}
