package com.lizhaoxuan.onceclick;


import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.example.ProxyInfo;

import java.util.LinkedHashMap;
import java.util.Map;

public class OnceInit {
    private static final Map<Class<?>, AbstractInjector<Object>> INJECTORS = new LinkedHashMap<Class<?>, AbstractInjector<Object>>();

    private static final long INTERVAL_TIME = 2000;

    public static void once(Activity activity, long intervalTime) {
        AbstractInjector<Object> injector = findInjector(activity);
        injector.inject(Finder.ACTIVITY, activity, activity);
        injector.setIntervalTime(intervalTime);
    }

    public static void once(View view, long intervalTime) {
        AbstractInjector<Object> injector = findInjector(view);
        injector.inject(Finder.VIEW, view, view);
        injector.setIntervalTime(intervalTime);
    }

    public static void once(Activity activity) {
        once(activity, INTERVAL_TIME);
    }

    public static void once(View view) {
        once(view, INTERVAL_TIME);
    }

    private static AbstractInjector<Object> findInjector(Object activity) {
        Class<?> clazz = activity.getClass();
        AbstractInjector<Object> injector = INJECTORS.get(clazz);
        if (injector == null) {
            try {
                Class injectorClazz = Class.forName(clazz.getName() + "$$"
                        + ProxyInfo.PROXY);
                injector = (AbstractInjector<Object>) injectorClazz
                        .newInstance();
                INJECTORS.put(clazz, injector);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return injector;
    }

}
