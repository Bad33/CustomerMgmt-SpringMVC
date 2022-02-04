package com.democrud.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration

@ComponentScan(basePackages = {
    "com.democrud"
})
public class CrudConfigs
{
	 @Bean
	    public InternalResourceViewResolver resolver() {
	        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	        resolver.setViewClass(JstlView.class);
	        resolver.setPrefix("/WEB-INF/views/");
	        resolver.setSuffix(".jsp");
	        return resolver;
	    }
	 
//	 	@Override
//	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	        registry
//	            .addResourceHandler("/resources/**")
//	            .addResourceLocations("/resources/");
//	    }

}
