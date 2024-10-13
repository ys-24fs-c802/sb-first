package kr.co.cofile.sbfirst.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class SampleAspect {

    @Before("execution(* kr.co.cofile.sbfirst.chapter03.used.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("===== Before Advice =====");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        System.out.printf("메서드:%s\n", joinPoint.getSignature().getName());
    }
}
