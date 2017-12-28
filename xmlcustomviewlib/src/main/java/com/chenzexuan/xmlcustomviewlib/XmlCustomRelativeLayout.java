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

    private XmlCustomViewParams mXmlCustomViewParams;
    private XmlCustomViewHelper.OnDisableStateClickListener mOnDisableStateClickListener;

    public XmlCustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = XmlCustomViewHelper.buildXmlCustomViewParams(context, attrs);
        Drawable background = XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
    }

    public void setDefaultBackgroundColor(int color) {
        mXmlCustomViewParams.setRawBackgroundColor(color);
        setBackgroundDrawable(XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams));
    }

    public void updateXmlCustomViewParams(XmlCustomViewParams viewParams) {
        if (viewParams == null) {
            return;
        }
        mXmlCustomViewParams = viewParams;
        setBackgroundDrawable(XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams));
    }

    public XmlCustomViewParams getXmlCustomViewParams() {
        return mXmlCustomViewParams;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN && mOnDisableStateClickListener != null) {
            mOnDisableStateClickListener.onDisableStateClick();
        }
        return super.onTouchEvent(event);
    }

    public void setOnDisableStateClickListener(XmlCustomViewHelper.OnDisableStateClickListener listener) {
        mOnDisableStateClickListener = listener;
    }
}
