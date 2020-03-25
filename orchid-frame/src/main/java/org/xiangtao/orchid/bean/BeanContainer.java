package org.xiangtao.orchid.bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * bean容器
 * @author XiangTao
 * @date 2020年3月13日
 */
public class BeanContainer {
	/**
	 * 存放bean的map
	 */
	private final Map<String, Object> beanMap = new ConcurrentHashMap<String, Object>();
	/**
	 * 单例模式
	 */
	private BeanContainer instance = null;
	
	private BeanContainer() {
		
	}
	
	/**
	 * 加载baseClass所在包及其子包中的bean
	 * @param baseClass
	 */
	public void loadBeans(Class<?> baseClass) {
		
	}
	
	public BeanContainer getInstance() {
		if(instance == null) {
			instance = new BeanContainer();
		}
		return instance;
	}
}
