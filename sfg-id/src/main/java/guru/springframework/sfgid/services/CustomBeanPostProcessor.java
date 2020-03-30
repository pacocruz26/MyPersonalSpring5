package guru.springframework.sfgid.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor{
	
	  @Override
	    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
			System.out.println("## - CustomBeanPostProcessor - postProcessBeforeInitialization");
	        if(bean instanceof LifeCycleDemoBean){
	        	System.out.println("####################### - LifeCycleDemoBean - beforeInit");
	            ((LifeCycleDemoBean) bean).beforeInit();
	        }
	        return bean;
	    }

	    @Override
	    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	    	System.out.println("## - CustomBeanPostProcessor - postProcessAfterInitialization");
	        if(bean instanceof LifeCycleDemoBean){
	        	System.out.println("####################### - LifeCycleDemoBean - afterInit");
	            ((LifeCycleDemoBean) bean).afterInit();
	        }
	        return bean;
	    }
}