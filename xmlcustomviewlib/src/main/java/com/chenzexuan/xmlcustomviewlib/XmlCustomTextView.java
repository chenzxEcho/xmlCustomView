package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;


/**
 * Created by chenzexuan on 2017/1/12.
 *
 * introduce in FlatXmlViewHelper
 */

public class XmlCustomTextView extends TextView implements FlatXmlView {

    private FlatXml mXmlParams;
    private FlatXmlViewHelper.OnDisableStateClickListener mOnDisableStateClickListener;

    public XmlCustomTextView(Context context, FlatXml viewParams) {
        super(context);
        mXmlParams = viewParams;
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
        ColorStateList colorStateList = FlatXmlViewHelper
            .buildColorStateList(this, mXmlParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public XmlCustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlParams = FlatXmlViewHelper.buildXmlParams(context, attrs);
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
        ColorStateList colorStateList = FlatXmlViewHelper
            .buildColorStateList(this, mXmlParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }
    public void setDefaultTextColor(int color) {
        setTextColor(FlatXmlViewHelper.buildColorStateList(this, color));
    }

    public void setDefaultBackgroundColor(int color) {
        mXmlParams.setRawBackgroundColor(color);
        setBackgroundDrawable(FlatXmlViewHelper.buildBackgroundDrawable(mXmlParams));
    }

    public void updateXmlParams(FlatXml viewParams) {
        if (viewParams == null) {
            return;
        }
        mXmlParams = viewParams;
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
        ColorStateList colorStateList = FlatXmlViewHelper
            .buildColorStateList(this, mXmlParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public FlatXml getXmlParams() {
        return mXmlParams;
    }

    public void setTextColor(int defaultColor, int pressedColor, int disableColor, int focusedColor, int selectedColor) {
        setTextColor(FlatXmlViewHelper
            .buildColorStateList(pressedColor, disableColor, focusedColor, selectedColor, defaultColor));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN && mOnDisableStateClickListener != null) {
            mOnDisableStateClickListener.onDisableStateClick();
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void setOnDisableStateClickListener(FlatXmlViewHelper.OnDisableStateClickListener listener) {
        mOnDisableStateClickListener = listener;
    }
}
