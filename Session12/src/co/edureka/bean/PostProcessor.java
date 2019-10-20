package co.edureka.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
		System.out.println(">> postProcess ##After## Initialization executed");
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		System.out.println(">> postProcess **Before** Initialization executed");
		return bean;
	}

}
