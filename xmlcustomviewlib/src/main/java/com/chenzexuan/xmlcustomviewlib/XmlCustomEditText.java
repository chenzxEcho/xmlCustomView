package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by chenzexuan on 2017/1/12.
 *
 * introduce in XmlCustomViewHelper
 */

public class XmlCustomEditText extends EditText {

    private final XmlCustomViewParams mXmlCustomViewParams;

    public XmlCustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = XmlCustomViewHelper.buildXmlCustomViewParams(context, attrs);
        Drawable background = XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            setBackgroundDrawable(background);
        }
        ColorStateList colorStateList = XmlCustomViewHelper.buildColorStateList(this, mXmlCustomViewParams);
        if (colorStateList != null) {
            setTextColor(colorStateList);
        }
    }

    public void setDefaultTextColor(int color) {
        setTextColor(XmlCustomViewHelper.buildColorStateList(this, color));
    }

    public void setTextColor(int defaultColor, int pressedColor, int disableColor, int focusedColor, int selectedColor) {
        setTextColor(XmlCustomViewHelper.buildColorStateList(pressedColor, disableColor, focusedColor, selectedColor, defaultColor));
    }
}
