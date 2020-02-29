package com.company.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //方法体1
        //前置通知
        System.out.println("环绕模仿前置");
        try {
            //方法体2
            Object result = methodInvocation.proceed();
            //result目标方法的返回值
            System.out.println("环绕模仿后置");
        }catch (Exception e){
            //方法3
            //异常通知
        }
        return null;
    }
}
