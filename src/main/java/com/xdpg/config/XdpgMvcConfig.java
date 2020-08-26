package com.xdpg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class XdpgMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/welcome.html").setViewName("welcome");
        registry.addViewController("/main.html").setViewName("index");//登录后重定向到index，避免url显示登录信息
        registry.addViewController("/user/member-list.html").setViewName("/user/member-list");
        registry.addViewController("/user/member-list1.html").setViewName("/user/member-list1");
        registry.addViewController("/user/member-add.html").setViewName("/user/member-add");
        registry.addViewController("/jd/jd_list.html").setViewName("/jd/jd_list");
        registry.addViewController("/jd/jd_veiw.html").setViewName("/jd/jd_veiw");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Intercepter()).addPathPatterns("/**")
                .excludePathPatterns("/","/login","/login.html","/css/**","/fonts/**","/images/**","/js/**","/lib/**");
    }
}
