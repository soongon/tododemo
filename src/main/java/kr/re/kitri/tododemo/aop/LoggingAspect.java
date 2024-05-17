package kr.re.kitri.tododemo.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    // 로깅하는 코드 함수.. 만들기
    @Before("execution(* kr.re.kitri.tododemo.controller.*Controller.get*(..))")
    public void logging(JoinPoint joinPoint) {
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        log.debug(clsName + "." + methodName + "() 에서 로깅합니다.");
    }
}
