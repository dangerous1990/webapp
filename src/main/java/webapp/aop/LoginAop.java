package webapp.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * @author admin
 *
 */
@Aspect
@Service
public class LoginAop {
	
	@Pointcut("execution(* webapp.controller.LoginController.login(..))")
	public void pointCut(){
		
	}
	@Before("pointCut()")
	public void beforeLogin(){
		System.out.println("before login");
	}
	@After("pointCut()")
	public void afterLogin(){
		System.out.println("after login");
	}
//	@Around("pointCut()")
//	public void aroundLogin(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("before around login");
//		pjp.proceed();
//		System.out.println("after around login");
//	}
}
