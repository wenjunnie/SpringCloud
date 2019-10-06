package com.imooc.apigateway.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wenjun
 * @Date: 2019/9/30 19:46
 */
public class CookieUtil {
    /**
     * 设置Cookie
     * @param response
     * @param name
     * @param value
     * @param maxAge
     */
    public static void set(HttpServletResponse response,
                           String name,
                           String value,
                           int maxAge) {
        Cookie cookie = new Cookie(name,value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     * 获取Cookie
     * @param request
     * @param name
     * @return
     */
    public static Cookie get(HttpServletRequest request,String name) {
        Cookie[] cookies = request.getCookies();
        if(cookies != null) {
            for (Cookie cookie: cookies) {
                if(name.equals(cookie.getName())) {
                    return cookie;
                }
            }
        }
        return null;
    }
}
