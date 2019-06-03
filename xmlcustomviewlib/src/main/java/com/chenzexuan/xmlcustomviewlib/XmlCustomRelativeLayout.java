package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;


/**
 * Created by chenzexuan on 2017/1/12.
 */

public class XmlCustomRelativeLayout extends RelativeLayout {

    private FlatXml mXmlCustomViewParams;
    private FlatXmlViewHelper.OnDisableStateClickListener mOnDisableStateClickListener;

    public XmlCustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = FlatXmlViewHelper.buildXmlParams(context, attrs);
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
    }

    public void setDefaultBackgroundColor(int color) {
        mXmlCustomViewParams.setRawBackgroundColor(color);
        setBackgroundDrawable(FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams));
    }

    public void updateXmlCustomViewParams(FlatXml viewParams) {
        if (viewParams == null) {
            return;
        }
        mXmlCustomViewParams = viewParams;
        setBackgroundDrawable(FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams));
    }

    public FlatXml getXmlCustomViewParams() {
        return mXmlCustomViewParams;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN && mOnDisableStateClickListener != null) {
            mOnDisableStateClickListener.onDisableStateClick();
        }
        return super.onTouchEvent(event);
    }

    public void setOnDisableStateClickListener(FlatXmlViewHelper.OnDisableStateClickListener listener) {
        mOnDisableStateClickListener = listener;
    }
}
