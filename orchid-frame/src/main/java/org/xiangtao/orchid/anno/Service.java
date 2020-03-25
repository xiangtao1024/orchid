package org.xiangtao.orchid.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Service
 * @author XiangTao
 * @date 2020年3月13日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Bean
public @interface Service{

}
