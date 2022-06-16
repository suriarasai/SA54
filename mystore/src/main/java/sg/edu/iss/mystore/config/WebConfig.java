package sg.edu.iss.mystore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sg.edu.iss.mystore.interceptor.ProcessingTimeLogInterceptor;

@Component
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	ProcessingTimeLogInterceptor ptimelogger;
	
	
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(ptimelogger);
	
	}

}
