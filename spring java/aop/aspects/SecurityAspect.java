package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityAspect {
	@After(value = "execution (* aop.OrderService.*(..))")
	public void beforeAdviceMethod(JoinPoint jp) {
		System.out.println("After Security Advice --> " + jp.getSignature());
	}

}
