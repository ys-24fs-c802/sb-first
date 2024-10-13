package kr.co.cofile.sbfirst.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

// 애스펙트
@Aspect
@Component
public class SampleAspect {

    // 조인트포인트 - 포인트컷(반환값, 패키지.클래스.메서드(인수))
    @Before("execution(* kr.co.cofile.sbfirst.chapter03.used.*Greet.*(..))")
    // 어드바이스
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("===== Before Advice =====");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        System.out.printf("메서드:%s\n", joinPoint.getSignature().getName());
    }

    @After("execution(* kr.co.cofile.sbfirst.chapter03.used.*Greet.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("===== After Advice =====");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        System.out.printf("메서드:%s\n", joinPoint.getSignature().getName());
    }
}
