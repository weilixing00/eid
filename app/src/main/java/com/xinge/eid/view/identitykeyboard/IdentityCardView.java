package com.xinge.eid.view.identitykeyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/**
 * Created by Administrator on 2017/5/23.
 */

public class IdentityCardView extends KeyboardView {

    private Context context;

    public IdentityCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       /* List<Keyboard.Key> keys = getKeyboard().getKeys();
        for(Keyboard.Key key: keys) {
            if(key.label.equals("delete"))
                resetOKBtn(key, canvas);
        }*/
    }

    /**
     * 绘制OK键的点9图
     * @author Song
     * @param key
     * @param canvas
     */
    private void resetOKBtn(Keyboard.Key key, Canvas canvas) {
        //将OK键重新绘制
       /* Drawable npd = (Drawable) context.getResources().getDrawable(R.mipmap.icon_number_del);
        npd.setBounds(key.x, key.y + 1, key.x + key.width, key.y + key.height + 1);
        npd.draw(canvas);*/
    }
}
