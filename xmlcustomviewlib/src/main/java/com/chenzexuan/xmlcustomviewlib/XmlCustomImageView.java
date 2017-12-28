package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by chenzexuan on 2017/1/12.
 *
 * introduce in XmlCustomViewHelper
 */

public class XmlCustomImageView extends ImageView {

    private final XmlCustomViewParams mXmlCustomViewParams;

    public XmlCustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = XmlCustomViewHelper.buildXmlCustomViewParams(context, attrs);
        Drawable background = XmlCustomViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
    }
}
