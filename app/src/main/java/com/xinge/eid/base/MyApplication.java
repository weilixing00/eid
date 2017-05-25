package com.xinge.eid.base;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by Administrator on 2017/5/17.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        KLog.init(true,"weilixing");

    }
}
