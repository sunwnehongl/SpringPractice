package com.swh.spring.bean.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Auther: swh
 * @Date: 2019/7/1 21:49
 * @Description:
 */

@Aspect
public class CDPlayAOP {

    @Pointcut("** execution(com.swh.spring.bean.service.impl.*.play(..))")
    public void point() {
    }

    @Before("point")
    public void before(){

    }
}
