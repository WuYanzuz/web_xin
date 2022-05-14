package edu.jxut.phos.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



/**
 * @Author MengYuan Zhang
 * @Date 2022/5/14 16:18
 * @CreatedBy IntelliJ IDEA
 */
@Slf4j
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        log.info("开始静态资源映射");
        registry.addResourceHandler("/xin/**").addResourceLocations("classpath:/phosResources/");
    }
}
