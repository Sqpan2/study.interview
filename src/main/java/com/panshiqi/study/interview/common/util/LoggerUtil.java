
package com.panshiqi.study.interview.common.util;

import org.slf4j.LoggerFactory;

public enum LoggerUtil {

    INSTANCE;

    private org.slf4j.Logger logger       = null;
    private org.slf4j.Logger accessLogger = null;

    private LoggerUtil() {
        try {
            logger = LoggerFactory.getLogger("root");
            accessLogger = LoggerFactory.getLogger("accesslog");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void access(String msg) {
        try {
            accessLogger.info("{} -{}", getClazzName(), msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getClazzName() {
        try {
            StackTraceElement a = (StackTraceElement) Thread.currentThread().getStackTrace()[3];
            return a.getClassName();
        } catch (Exception e) {
            return "";
        }
    }

}
