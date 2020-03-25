package org.xiangtao.orchid.logs.impl;


import org.xiangtao.orchid.logs.Log;

public class OrchidLog implements Log{

	@Override
	public boolean errorOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void error(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(String fmt, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Object message, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean warnOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void warn(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(String fmt, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void warn(Object message, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean infoOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(String fmt, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info(Object message, Throwable t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean debugOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(String fmt, Object... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debug(Object message, Throwable t) {
		// TODO Auto-generated method stub
		
	}
	
//	private void printOut(String level, Object message, Throwable t) {
//        System.out.printf("%s %s [%s] %s\n", Times.sDTms2(new Date()), level, Thread.currentThread().getName(),message);
//        if (t != null)
//            t.printStackTrace(System.out);
//    }
//
//    private void errorOut(String level, Object message, Throwable t) {
//        System.err.printf("%s %s [%s] %s\n", Times.sDTms2(new Date()), level, Thread.currentThread().getName(),message);
//        if (t != null)
//            t.printStackTrace(System.err);
//    }
}
