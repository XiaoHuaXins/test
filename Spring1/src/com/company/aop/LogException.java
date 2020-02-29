package com.company.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
   //空接口
public class LogException implements ThrowsAdvice {
    //必须实现该方法
    public void afterThrowing(Method method,Object args,Object target,Throwable throwable){
        System.out.println("异常通知");
    }
}
