package com.xinge.eid.base;

import android.app.Activity;
import android.os.Bundle;

import com.arellomobile.mvp.MvpActivity;
import com.jaeger.library.StatusBarUtil;
import com.xinge.eid.R;
import com.xinge.eid.utils.click.AntiShake;

/**
 * Created by Administrator on 2017/5/17.
 */

public class BaseActivity extends MvpActivity {


    public AntiShake btUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btUtil = new AntiShake();
//        StatusBarUtil.setColor(this,getResources().getColor(R.color.blue),0);
    }
}
