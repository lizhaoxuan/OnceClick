package com.lizhaoxuan.onceclick;

import android.app.Activity;
import android.view.View;

public enum Finder {
    VIEW {
        @Override
        public View findViewById(Object source, int id) {
            return ((View) source).findViewById(id);
        }
    },
    ACTIVITY {
        @Override
        public View findViewById(Object source, int id) {
            return ((Activity) source).findViewById(id);
        }
    };
    public abstract View findViewById(Object source, int id);
}
