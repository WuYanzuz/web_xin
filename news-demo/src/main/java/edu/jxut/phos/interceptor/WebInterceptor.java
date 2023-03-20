package edu.jxut.phos.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author MengYuan Zhang
 * @Date 2022/5/14 18:31
 * @CreatedBy IntelliJ IDEA
 */
@Slf4j
public class WebInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("请求路径为:{}",request.getRequestURI());
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
