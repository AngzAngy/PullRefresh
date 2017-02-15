package com.lee.pullrefresh.ui;

import android.os.Build;

/**
 * Created by Administrator on 2017/2/15.
 */

public class APIUtils {
    public static boolean hasHoneycomb(){
        try {
            return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
        }catch (Throwable throwable){
            return Build.VERSION.SDK_INT >= 11;
        }
    }
}
