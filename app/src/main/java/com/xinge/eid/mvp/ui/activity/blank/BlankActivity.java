package com.xinge.eid.mvp.ui.activity.blank;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.xinge.eid.R;
import com.xinge.eid.base.BaseActivity;
import com.xinge.eid.mvp.presentation.view.blank.BlankView;
import com.xinge.eid.mvp.presentation.presenter.blank.BlankPresenter;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class BlankActivity extends BaseActivity implements BlankView {
    public static final String TAG = "BlankActivity";
    @InjectPresenter
    BlankPresenter mBlankPresenter;


    public static Intent getIntent(final Context context) {
        Intent intent = new Intent(context, BlankActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);


    }
}
