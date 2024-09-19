package config;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // chú thích daây là ớp cấu hinh
@EnableWebMvc  // sử dụng cấu hình MVC
@ComponentScan(basePackages = {"controller","repository"})
//puet pagake để tự động phat hiện bean (@Component,@Controller,@service = sử l nghiệp vu,@repository=dao )
public class WebConfig {
    private ApplicationContext applicationContext;

    //cấu hình view
    // định nghĩa bean
    @Bean
    public ViewResolver viewResolver() {

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

     @Bean
    public CommonsMultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSizePerFile(5*1024*1024);
        multipartResolver.setMaxUploadSize(25*1024*1024);
        return multipartResolver;
    }


}
