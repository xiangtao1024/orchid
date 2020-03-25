package org.xiangtao.orchid.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注入bean
 * @author XiangTao
 * @date 2020年3月13日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
	/**
	 * 指定注入bean的名字，为空则默认使用所定义类的名字
	 * @return
	 */
	String name() default "";
}
