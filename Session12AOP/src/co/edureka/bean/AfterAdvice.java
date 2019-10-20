package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{ //  After execution of business method

	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println(">> AfterAdvice <<");
		
		if(method.getName().equals("purchaseProduct")) {
			Product product = (Product)beanRef; // Downcast beanRef and get the reference to the Product Object in memory
			
			// Acknowledge Logistics to Deliver Product
			// 3.
			System.out.println(">> Send an Email to Logistcis Department");
			System.out.println(">> Please deliver "+product.getName()+" at "+inputs[0]+" by "+inputs[1]);
			
		}
		
		System.out.println(">> AfterAdvice <<");
		System.out.println();
		
	}
	
}
