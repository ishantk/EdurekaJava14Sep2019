package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{ //  Before execution of business method

	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println(">> BeforeAdvice <<");
		
		if(method.getName().equals("purchaseProduct")) {
			Product product = (Product)beanRef; // Downcast beanRef and get the reference to the Product Object in memory
			
			// Checking stock for Product means you may be enquiring DataBase or vendors etc...
			// 1.
			if(product.stock>0) {
				System.out.println(">> Stock is Available !! Happy Shopping :)");
				System.out.println(">> We shall be able to deliver the product to "+inputs[0]);
			}else {
				System.out.println(">> Sorry No Products Available as of Now !!");
			}
			
		}
		
		System.out.println(">> BeforeAdvice <<");
		
		System.out.println();
		
		
	} 

	
	
}
