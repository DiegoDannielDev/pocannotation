package br.com.projeto.pocannotation.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class VerifierService {

    @Around(value = "@annotation(br.com.projeto.pocannotation.annotations.VerifierId)")
    public Object verifierIdNull(ProceedingJoinPoint joinPoint) throws Throwable {

        var obj = Arrays.stream(joinPoint.getArgs()).map(o -> o instanceof Long ? isExist((Long) o) : o).toArray();
        return joinPoint.proceed(obj);
    }

    public Long isExist(Long id) {
        if (id != null) {
            return id;
        }
        return 0L;
    }
}
