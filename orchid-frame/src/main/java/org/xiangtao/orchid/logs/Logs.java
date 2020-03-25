package org.xiangtao.orchid.logs;

import org.xiangtao.orchid.logs.impl.OrchidLog;

public class Logs {
	public static Log getLog(Class<?> clazz) {
        return getLog(clazz.getName());
    }
	
	public static Log getLog(String className) {
        return (Log) new OrchidLog();
    }
}
