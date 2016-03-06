package com.example.administrator.app1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/3/5 0005.
 */
public class MarqueeText extends TextView {
    public MarqueeText(Context context) {
        super(context);
    }
    public MarqueeText(Context context, AttributeSet attrs,int defStyle){
        super(context, attrs,defStyle);

    }
    public MarqueeText(Context context, AttributeSet attrs){
        super(context, attrs);

    }
    public boolean isFocused(){
        return true;
    }
}
