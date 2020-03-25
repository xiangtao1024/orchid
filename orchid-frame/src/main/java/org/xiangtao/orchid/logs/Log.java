package org.xiangtao.orchid.logs;

/**
 * 日志接口
 * @author XiangTao
 * @date 2020年3月13日
 */
public interface Log {
    boolean errorOn();
    void error(Object message);
    void error(String fmt, Object... args);
    void error(Object message, Throwable t);
    
    boolean warnOn();
    void warn(Object message);
    void warn(String fmt, Object... args);
    void warn(Object message, Throwable t);
    
    boolean infoOn();
    void info(Object message);
    void info(String fmt, Object... args);
    void info(Object message, Throwable t);
    
    boolean debugOn();
    void debug(Object message);
    void debug(String fmt, Object... args);
    void debug(Object message, Throwable t);
}
