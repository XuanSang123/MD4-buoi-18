package config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//dispacher servlet khởi ta ứng dụng
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {

        //đọc các cấu hình hốc
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //c hình servlet
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter  filter = new CharacterEncodingFilter("UTF-8",true);
        return new Filter[]{filter};
    }
}
