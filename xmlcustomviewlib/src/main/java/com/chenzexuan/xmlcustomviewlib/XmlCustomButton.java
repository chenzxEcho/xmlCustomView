package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;


/**
 * Created by chenzexuan on 2017/1/11.
 *
 * introduce in XmlCustomViewHelper
 */

public class XmlCustomButton extends Button implements XmlCustomView {

    private XmlCustomViewParams mXmlCustomViewParams;
    private XmlCustomViewHelper.OnDisableStateClickListener mOnDisableStateClickListener;

    public XmlCustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = XmlCustomViewHelper.buildXmlCustomViewParams(context, attrs);
        Drawable background = XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
        ColorStateList colorStateList = XmlCustomViewHelper.buildColorStateList(this, mXmlCustomViewParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setDefaultTextColor(int color) {
        setTextColor(XmlCustomViewHelper.buildColorStateList(this, color));
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

    public void setTextColor(int defaultColor, int pressedColor, int disableColor, int focusedColor, int selectedColor) {
        setTextColor(XmlCustomViewHelper.buildColorStateList(pressedColor, disableColor, focusedColor, selectedColor, defaultColor));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP && mOnDisableStateClickListener != null) {
            mOnDisableStateClickListener.onDisableStateClick();
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void setOnDisableStateClickListener(XmlCustomViewHelper.OnDisableStateClickListener listener) {
        mOnDisableStateClickListener = listener;
    }
}
