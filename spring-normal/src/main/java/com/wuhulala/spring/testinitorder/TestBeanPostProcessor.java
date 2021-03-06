package com.wuhulala.spring.testinitorder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 功能说明: com.wuhulala.spring.testinitorder<br>
 * 注意事项: <br>
 * 系统版本: v1.0<br>
 * 开发人员: xueah20964<br>
 * 开发时间: 2017/7/11<br>
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private TestInitOrder initOrder;

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("依赖注入时,,,,," + initOrder);
        System.out.println("BeanPostProcessor====" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
