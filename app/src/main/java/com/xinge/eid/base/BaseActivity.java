package com.xinge.eid.base;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.arellomobile.mvp.MvpActivity;
import com.socks.library.KLog;
import com.xinge.eid.mvp.ui.activity.GestureShowActivity;
import com.xinge.eid.utils.ActivityManagerUtil;
import com.xinge.eid.utils.JUtils;
import com.xinge.eid.utils.MyLifecycleHandler;
import com.xinge.eid.utils.click.AntiShake;

import java.util.List;

/**
 * Created by Administrator on 2017/5/17.
 */

public class BaseActivity extends MvpActivity {
public static boolean isLock=false;

    public AntiShake btUtil;
    public ActivityManagerUtil activityManagerUtil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btUtil = new AntiShake();
//        StatusBarUtil.setColor(this,getResources().getColor(R.color.blue),0);


        activityManagerUtil = ActivityManagerUtil.getInstance();
        activityManagerUtil.pushOneActivity(this);
    }


    public static boolean isBackground = false;    //声明一个布尔变量,记录当前的活动背景
    @Override
    public void onPause() {
        super.onPause();
        KLog.e(MyLifecycleHandler.isApplicationInForeground());
        if (!MyLifecycleHandler.isApplicationInForeground())
            isBackground = true;
    }

    // TODO: 2017/5/22 这个必须设置 static 否则无效
    public static boolean isGone = false;//标识跳转的状态 true 跳转过  false 未跳转过


    @Override
    public void onResume() {
        super.onResume();
        if (isBackground) {//
            if (isGone) {
//                isGone = false;
                KLog.e("isGone = false");

            }
            else {
                KLog.e("从后台回到前台");
                isGone = true;
//                startActivity(new Intent(this, GestureShowActivity.class));

            }
            isBackground = false;
        }
    }





}