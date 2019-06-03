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
 * introduce in FlatXmlViewHelper
 */

public class XmlCustomButton extends Button implements FlatXmlView {

    private FlatXml mXmlCustomViewParams;
    private FlatXmlViewHelper.OnDisableStateClickListener mOnDisableStateClickListener;

    public XmlCustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = FlatXmlViewHelper.buildXmlParams(context, attrs);
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
        ColorStateList colorStateList = FlatXmlViewHelper
            .buildColorStateList(this, mXmlCustomViewParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setDefaultTextColor(int color) {
        setTextColor(FlatXmlViewHelper.buildColorStateList(this, color));
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

    public void setTextColor(int defaultColor, int pressedColor, int disableColor, int focusedColor, int selectedColor) {
        setTextColor(FlatXmlViewHelper
            .buildColorStateList(pressedColor, disableColor, focusedColor, selectedColor, defaultColor));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP && mOnDisableStateClickListener != null) {
            mOnDisableStateClickListener.onDisableStateClick();
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void setOnDisableStateClickListener(FlatXmlViewHelper.OnDisableStateClickListener listener) {
        mOnDisableStateClickListener = listener;
    }
}
