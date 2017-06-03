package com.xinge.eid.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.socks.library.KLog;
import com.xinge.eid.utils.MyLifecycleHandler;

/**
 * Created by Administrator on 2017/5/17.
 */

public class MyApplication extends Application {
    public static Context context;
    private int appCount = 0;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();

        KLog.init(true, "weilixing");




        registerActivityLifecycleCallbacks(new MyLifecycleHandler());

        Fresco.initialize(this, ImagePipelineConfig
                .newBuilder(this)
                .setDownsampleEnabled(true)
                .build());

    }



    public int getAppCount() {
        return appCount;
    }

    public void setAppCount(int appCount) {
        this.appCount = appCount;
    }

}
