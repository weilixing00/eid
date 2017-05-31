package com.xinge.eid.base;

import android.app.Application;
import android.content.Context;

import com.socks.library.KLog;

/**
 * Created by Administrator on 2017/5/17.
 */

public class MyApplication extends Application {
public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context=getApplicationContext();

        KLog.init(true,"weilixing");

    }
}
