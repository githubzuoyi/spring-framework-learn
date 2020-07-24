package com.spring.feizuo;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("执行MyInstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation方法，获取参数 beanclass："+beanClass+",beanname: "+beanName);
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("执行MyInstantiationAwareBeanPostProcessor#postProcessAfterInstantiation，获取实例化之后得bean："+bean+",beanname: "+beanName);
        return false;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("执行MyInstantiationAwareBeanPostProcessor#postProcessProperties，获取实例化之后的属性值得PropertyValues："+pvs+",beanname: "+beanName);
        return null;
    }

}
