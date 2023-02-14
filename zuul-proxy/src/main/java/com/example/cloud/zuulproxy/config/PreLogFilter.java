package com.example.cloud.zuulproxy.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
*
 * zuul 过滤请求
 *
 * pre：在请求被路由到目标服务前执行，比如权限校验、打印日志等功能；
 * routing：在请求被路由到目标服务时执行，这是使用Apache HttpClient或Netflix Ribbon构建和发送原始HTTP请求的地方；
 * post：在请求被路由到目标服务后执行，比如给目标服务的响应添加头信息，收集统计数据等功能；
 * error：请求在其他阶段发生错误时执行。
 * #过滤器的生命周期
* @Author: hfl
* @Date: 2023/2/14
*/
@Component
@Slf4j
public class PreLogFilter extends ZuulFilter {

    /**
     * 过滤器类型，有pre、routing、post、error四种。
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序，数值越小优先级越高。
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否进行过滤，返回true会执行过滤。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 自定义的过滤器逻辑，当shouldFilter()返回true时会执行。
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String host = request.getRemoteHost();
        String method = request.getMethod();
        String uri = request.getRequestURI();
        log.info("Remote host:{},method:{},uri:{}", host, method, uri);
        return null;
    }
}
