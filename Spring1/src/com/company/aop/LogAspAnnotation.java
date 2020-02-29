package com.company.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("logAnnotation")
//将该类纳入Springioc容器
@Aspect
    //说明该类一个通知
public class LogAspAnnotation {

    @Before("execution(public void addStudent(com.company.entity.Person))")
    //属性：定义切点
    //execution中不一定非要叫全类名，不加所有名为该方法的通知都会执行
    public void myBefore(){
        System.out.println("[前置通知]");
    }
    @AfterReturning("execution(public void addStudent(com.company.entity.Person))")
    public void myAfter(){
        System.out.println("后置通知");
    }
}
