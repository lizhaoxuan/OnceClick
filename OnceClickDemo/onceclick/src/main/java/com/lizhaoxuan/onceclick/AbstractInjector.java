package com.lizhaoxuan.onceclick;

/**
 * 注射代码接口
 * @param <T>
 */
public interface AbstractInjector<T> {

    //注射代码
    void inject(Finder finder, T target, Object source);

    //设置间隔时间
    void setIntervalTime(long time);
}
