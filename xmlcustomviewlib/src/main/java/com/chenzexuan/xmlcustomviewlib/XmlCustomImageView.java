package com.chenzexuan.xmlcustomviewlib;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by chenzexuan on 2017/1/12.
 *
 * introduce in FlatXmlViewHelper
 */

public class XmlCustomImageView extends ImageView {

    private final FlatXml mXmlCustomViewParams;

    public XmlCustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mXmlCustomViewParams = FlatXmlViewHelper.buildXmlParams(context, attrs);
        Drawable background = FlatXmlViewHelper.buildBackgroundDrawable(mXmlCustomViewParams);
        if (background != null) {
            APICompatibleUtil.setBackgroundDrawable(this, background);
        }
    }
}
