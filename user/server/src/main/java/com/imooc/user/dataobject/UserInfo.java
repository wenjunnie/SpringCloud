package com.imooc.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: wenjun
 * @Date: 2019/9/30 19:20
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String id;
    private String username;
    private String password;
    private String openid;
    private Integer role;
}
