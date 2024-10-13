package kr.co.cofile.sbfirst.chapter03.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 애스펙트
@Aspect
@Component
public class SampleAspect {

    // 조인트포인트 - 포인트컷(반환값, 패키지.클래스.메서드(인수))
    @Around("execution(* kr.co.cofile.sbfirst.chapter03.used.*Greet.*(..))")
    // 어드바이스
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("===== Around Advice =====");
        System.out.println("===== 처리전 =====");
        Object result = joinPoint.proceed();
        System.out.println("===== 처리후 =====");
        return result;
    }
}
