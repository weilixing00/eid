package com.xinge.eid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.EditText
import com.xinge.eid.R.id.tv
import com.xinge.eid.mvp.ui.activity.blank.BlankActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import com.xinge.eid.view.identitykeyboard.CustomKeyboard



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv.
        tv.text = "kolt"
        tv.setOnClickListener { startActivity(Intent(MainActivity@ this, BlankActivity::class.java)); }
//        findViewById(R.id.tv).setOnClickListener(startActivity(BlankActivity));


        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        try {
            val cls = EditText::class.java
            val setShowSoftInputOnFocus = cls.getMethod("setShowSoftInputOnFocus", Boolean::class.javaPrimitiveType)
            setShowSoftInputOnFocus.isAccessible = true
            setShowSoftInputOnFocus.invoke(et, false)
        } catch (e: Exception) {
            e.printStackTrace()
        }


        //2 初试化键盘
////        val keyboardView = findViewById(R.id.customKeyboard) as MyKeyboardView
//        var mCustomKeyboard = CustomKeyboard(this@MainActivity, customKeyboard, et)
//        mCustomKeyboard.showKeyboard()
//
//})
//            setOnTouchListener(object : View.OnTouchListener() {
//
//            override fun onTouch(v: View, event: MotionEvent): Boolean {
//                mCustomKeyboard.showKeyboard()
//                return false
//            }
//        })
//        }
    }
}
