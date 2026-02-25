package com.test.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmpolyeeAnnotationAspect {
	@Before("@annotation(com.test.spring.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice");
	}

}
