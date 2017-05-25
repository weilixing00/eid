package com.xinge.eid.mvp.ui.activity.blank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.xinge.eid.R;
import com.xinge.eid.base.BaseActivity;
import com.xinge.eid.mvp.presentation.view.blank.BlankActivity1View;
import com.xinge.eid.mvp.presentation.presenter.blank.BlankActivity1Presenter;



import com.arellomobile.mvp.presenter.InjectPresenter;

public class BlankActivity1 extends BaseActivity implements BlankActivity1View {
    public static final String TAG = "BlankActivity1";
    @InjectPresenter
    BlankActivity1Presenter mBlankActivity1Presenter;


    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, BlankActivity1.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank_activity1);
    }
}
