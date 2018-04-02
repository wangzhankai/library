package com.wzk.mylibrary.base;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * 描述：MultiDexApplication防止放法术过多
 * Created by wangzhankai on 2018/2/7.
 */

public class BaseApplication extends MultiDexApplication {

    private static BaseApplication baseApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
        //屏幕适配
        AutoLayoutConifg.getInstance().useDeviceSize();
    }

    public static Context getAppContext() { return baseApplication; }
}
