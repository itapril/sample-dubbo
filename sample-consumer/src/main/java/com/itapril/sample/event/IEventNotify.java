package com.itapril.sample.event;

/**
 * @author itapril.
 * @create 2018/8/10 17:39.
 */
public interface IEventNotify {
    //    void oninvoke(Object res, Object... args);
    void onreturn(Object res, Object... args);
    void onthrow(Throwable ex, Object... args);
}
