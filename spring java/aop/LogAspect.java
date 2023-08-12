package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(5)
public class LogAspect {
	public LogAspect() {
		System.out.println("LogAspect()");
	}

	// Before Advice
	@Before(value = "execution (* aop.OrderService.*(..))") // pointcut
	public void beforeAdviceMethod(JoinPoint jp) {
//		System.out.println(jp.getClass());
//		if ( jp.getArgs().length > 0)
//	     	System.out.println("First argument : " + jp.getArgs()[0]);
		System.out.println("Before Log Advice --> " + jp.getSignature());
	}
    // After Advice 
	//@After(value = "execution (* aop.OrderService.*(..))")
	public void afterAdviceMethod(JoinPoint jp) {
		System.out.println("After Finally Advice --> " + jp.getSignature());
	}

	//@Around(value = "execution (* aop.OrderService.get*(..))")
	public Object aroundAdviceMethod(ProceedingJoinPoint pjp) {
		System.out.println("Before calling : " + pjp.getSignature());
		try {
			Object obj = pjp.proceed(pjp.getArgs()); // Call method in Target Object
			System.out.println("Success : " + obj);
			return obj;
		} catch (Throwable ex) {
			System.out.println("Exception : " + ex);
			return null;
		}
	}

    // After Throwing
	//@AfterThrowing(value = "execution (* aop.OrderService.*(..))", throwing = "ex")
	public void afterThrowingAdviceMethod(JoinPoint jp, Exception ex) {
		System.out.println("After Throwing Advice --> " + jp.getSignature());
		System.out.println("Exception is : " + ex.getMessage());
	}
}
