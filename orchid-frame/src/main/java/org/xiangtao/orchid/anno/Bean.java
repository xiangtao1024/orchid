package org.xiangtao.orchid.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Bean注解
 * @author XiangTao
 * @date 2020年3月13日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bean {
	/**
	 * bean名称，为空默认使用类名字
	 * @return
	 */
	String name() default "";
}
