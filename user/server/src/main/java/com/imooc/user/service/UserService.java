package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

/**
 * @Author: wenjun
 * @Date: 2019/9/30 19:25
 */
public interface UserService {
    UserInfo findByOpenid(String openid);
}
