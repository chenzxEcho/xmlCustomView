package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by chenzexuan on 2017/1/12.
 *
 * introduce in FlatXmlViewHelper
 */

public class XmlCustomEditText extends EditText {

    private final FlatXml mXmlCustomViewParams;

    public XmlCustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = FlatXmlViewHelper.buildXmlParams(context, attrs);
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            setBackgroundDrawable(background);
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

    public void setTextColor(int defaultColor, int pressedColor, int disableColor, int focusedColor, int selectedColor) {
        setTextColor(FlatXmlViewHelper
            .buildColorStateList(pressedColor, disableColor, focusedColor, selectedColor, defaultColor));
    }
}
