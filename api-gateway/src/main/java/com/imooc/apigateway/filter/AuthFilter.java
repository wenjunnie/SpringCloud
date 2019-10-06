//package com.imooc.apigateway.filter;
//
//import com.imooc.apigateway.constant.RedisConstant;
//import com.imooc.apigateway.utils.CookieUtil;
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.apache.commons.lang.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//
//import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
//import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
//
///**
// * 权限拦截（区分买家和卖家）
// * @Author: wenjun
// * @Date: 2019/9/30 15:27
// */
//@Component
//public class AuthFilter extends ZuulFilter {
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Override
//    public String filterType() {
//        return PRE_TYPE;
//    }
//
//    @Override
//    public int filterOrder() {
//        return PRE_DECORATION_FILTER_ORDER - 1;//数字越小优先级越高
//    }
//
//    @Override
//    public boolean shouldFilter() {
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//        /**
//         * /order/create 只能买家访问
//         * /order/finish 只能卖家访问
//         * /product/list 都可访问
//         */
//        if("/order/order/create".equals(request.getRequestURI())) {
//            Cookie cookie = CookieUtil.get(request, "openid");
//            if(cookie == null || StringUtils.isEmpty(cookie.getValue())) {
//                requestContext.setSendZuulResponse(false);
//                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//            }
//        }
//
//        if("/order/order/finish".equals(request.getRequestURI())) {
//            Cookie cookie = CookieUtil.get(request, "token");
//            if(cookie == null || StringUtils.isEmpty(cookie.getValue()) ||
//            StringUtils.isEmpty(stringRedisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_TEMPLATE, cookie.getValue())))) {
//                requestContext.setSendZuulResponse(false);
//                requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
//            }
//        }
//
//        return null;
//    }
//}
