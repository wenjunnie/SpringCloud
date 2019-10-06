package com.imooc.apigateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.imooc.apigateway.exception.RateLimitException;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVLET_DETECTION_FILTER_ORDER;

/**
 * 限流（使用令牌桶）
 * @Author: wenjun
 * @Date: 2019/9/30 16:11
 */
@Component
public class RateLimitFilter extends ZuulFilter {

    private static final RateLimiter RATE_LIMITER = RateLimiter.create(100);//导入google的包

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SERVLET_DETECTION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        if(!RATE_LIMITER.tryAcquire()) {//如果没有拿到令牌
            return new RateLimitException();
        }
        return null;
    }
}
