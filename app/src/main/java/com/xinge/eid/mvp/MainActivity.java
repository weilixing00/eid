package com.xinge.eid.mvp;

import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import com.xinge.eid.R;
import com.xinge.eid.base.BaseActivity;
import com.xinge.eid.view.identitykeyboard.CustomKeyboard;
import com.xinge.eid.view.identitykeyboard.IdentityCardView;

import java.lang.reflect.Method;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/5/23.
 */

public class MainActivity extends BaseActivity {
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.et)
    EditText writebankcard_mobileedit;
    @BindView(R.id.customKeyboard1)
    IdentityCardView customKeyboard;
    private CustomKeyboard mCustomKeyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        //1 屏蔽掉系统默认输入法
//        if (Build.VERSION.SDK_INT <= 10) {
//            writebankcard_mobileedit.setInputType(InputType.TYPE_NULL);
//        } else {
            getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
            try {
                Class<EditText> cls = EditText.class;
                Method setShowSoftInputOnFocus = cls.getMethod("setShowSoftInputOnFocus", boolean.class);
                setShowSoftInputOnFocus.setAccessible(true);
                setShowSoftInputOnFocus.invoke(writebankcard_mobileedit, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
//        }

        //2 初试化键盘
        IdentityCardView keyboardView = (IdentityCardView) findViewById(R.id.customKeyboard1);
        mCustomKeyboard = new CustomKeyboard(MainActivity.this, keyboardView, writebankcard_mobileedit);
//        mCustomKeyboard.showKeyboard();

        mCustomKeyboard.hideKeyboard();

        writebankcard_mobileedit.setOnTouchListener((v, event) -> {
            mCustomKeyboard.showKeyboard();
            return false;
        });



    }

    //物理返回键
    @Override
    public void onBackPressed() {
        if (mCustomKeyboard.isShowKeyboard()) {
            mCustomKeyboard.hideKeyboard();
        } else {
            finish();
        }
    }
}
