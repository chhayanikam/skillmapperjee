package com.niit.skillmapper.config;
import java.nio.charset.StandardCharsets;
import javax.servlet.Filter;
import javax.servlet.ServletRegistration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin(origins = {"http://localhost:8092", "http://localhost:4200"},maxAge = 4800, allowCredentials = "false") 
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
		System.out.println("in customizeRegistration");
		registration.setInitParameter("dispatchOptionsRequest", "true");
		registration.setAsyncSupported(true);
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//return new Class[]{WebResolver.class,AppContext.class};
		return new Class[] {AppConfig.class};

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}
