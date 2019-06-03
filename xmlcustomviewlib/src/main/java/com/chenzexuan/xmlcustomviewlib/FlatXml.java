package com.chenzexuan.xmlcustomviewlib;

import android.graphics.drawable.Drawable;

/**
 * Created by chenzexuan on 2017/1/13.
 */

public class FlatXml {

    public final static int DEFAULT_COLOR = 0;

    public final static int DEFAULT_SIZE = 0;

    public final static int DEFAULT_ALPHA = 0;

    public final static int DEFAULT_PRESS_ALPHA = 25;

    private int rawBackgroundColor;

    private int pressedBackgroundColor;

    private int disableBackgroundColor;

    private int focusedBackgroundColor;

    private int selectedBackgroundColor;

    private Drawable rawBackgroundDrawable;

    private Drawable pressedBackgroundDrawable;

    private Drawable disableBackgroundDrawable;

    private Drawable focusedBackgroundDrawable;

    private Drawable selectedBackgroundDrawable;

    private int rawBackgroundAlpha;

    private int pressedBackgroundAlpha;

    private int disableBackgroundAlpha;

    private int focusedBackgroundAlpha;

    private int selectedBackgroundAlpha;

    private float[] corners;

    private boolean noCorners;

    private float strokeWidth;

    private int strokeColor;

    private int maskAlpha;

    private int rawTextColor;

    private int pressedTextColor;

    private int disableTextColor;

    private int focusedTextColor;

    private int selectedTextColor;

    private Gradient gradient;

    public int getRawBackgroundColor() {
        return rawBackgroundColor;
    }

    public void setRawBackgroundColor(int rawBackgroundColor) {
        this.rawBackgroundColor = rawBackgroundColor;
    }

    public int getPressedBackgroundColor() {
        return pressedBackgroundColor;
    }

    public void setPressedBackgroundColor(int pressedBackgroundColor) {
        this.pressedBackgroundColor = pressedBackgroundColor;
    }

    public int getDisableBackgroundColor() {
        return disableBackgroundColor;
    }

    public void setDisableBackgroundColor(int disableBackgroundColor) {
        this.disableBackgroundColor = disableBackgroundColor;
    }

    public int getFocusedBackgroundColor() {
        return focusedBackgroundColor;
    }

    public void setFocusedBackgroundColor(int focusedBackgroundColor) {
        this.focusedBackgroundColor = focusedBackgroundColor;
    }

    public int getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    public void setSelectedBackgroundColor(int selectedBackgroundColor) {
        this.selectedBackgroundColor = selectedBackgroundColor;
    }

    public Drawable getRawBackgroundDrawable() {
        return rawBackgroundDrawable;
    }

    public void setRawBackgroundDrawable(Drawable rawBackgroundDrawable) {
        this.rawBackgroundDrawable = rawBackgroundDrawable;
    }

    public Drawable getPressedBackgroundDrawable() {
        return pressedBackgroundDrawable;
    }

    public void setPressedBackgroundDrawable(Drawable pressedBackgroundDrawable) {
        this.pressedBackgroundDrawable = pressedBackgroundDrawable;
    }

    public Drawable getDisableBackgroundDrawable() {
        return disableBackgroundDrawable;
    }

    public void setDisableBackgroundDrawable(Drawable disableBackgroundDrawable) {
        this.disableBackgroundDrawable = disableBackgroundDrawable;
    }

    public Drawable getFocusedBackgroundDrawable() {
        return focusedBackgroundDrawable;
    }

    public void setFocusedBackgroundDrawable(Drawable focusedBackgroundDrawable) {
        this.focusedBackgroundDrawable = focusedBackgroundDrawable;
    }

    public Drawable getSelectedBackgroundDrawable() {
        return selectedBackgroundDrawable;
    }

    public void setSelectedBackgroundDrawable(Drawable selectedBackgroundDrawable) {
        this.selectedBackgroundDrawable = selectedBackgroundDrawable;
    }

    public float[] getCorners() {
        return corners;
    }

    public float[] getInnerCorners() {
        if (strokeWidth == 0) {
            return corners;
        }
        float[] innerCorner = new float[8];
        for (int i = 0;i < innerCorner.length;i++) {
            innerCorner[i] = corners[i] - strokeWidth;
        }
        return innerCorner;
    }

    public void setCorners(float[] corners) {
        this.corners = corners;
    }

    public boolean isNoCorners() {
        return noCorners;
    }

    public void setNoCorners(boolean noCorners) {
        this.noCorners = noCorners;
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public int getMaskAlpha() {
        return maskAlpha;
    }

    public void setMaskAlpha(int maskAlpha) {
        this.maskAlpha = maskAlpha;
    }

    public int getRawBackgroundAlpha() {
        return rawBackgroundAlpha;
    }

    public void setRawBackgroundAlpha(int rawBackgroundAlpha) {
        this.rawBackgroundAlpha = rawBackgroundAlpha;
    }

    public int getPressedBackgroundAlpha() {
        return pressedBackgroundAlpha;
    }

    public void setPressedBackgroundAlpha(int pressedBackgroundAlpha) {
        this.pressedBackgroundAlpha = pressedBackgroundAlpha;
    }

    public int getDisableBackgroundAlpha() {
        return disableBackgroundAlpha;
    }

    public void setDisableBackgroundAlpha(int disableBackgroundAlpha) {
        this.disableBackgroundAlpha = disableBackgroundAlpha;
    }

    public int getFocusedBackgroundAlpha() {
        return focusedBackgroundAlpha;
    }

    public void setFocusedBackgroundAlpha(int focusedBackgroundAlpha) {
        this.focusedBackgroundAlpha = focusedBackgroundAlpha;
    }

    public int getSelectedBackgroundAlpha() {
        return selectedBackgroundAlpha;
    }

    public void setSelectedBackgroundAlpha(int selectedBackgroundAlpha) {
        this.selectedBackgroundAlpha = selectedBackgroundAlpha;
    }

    public int getRawTextColor() {
        return rawTextColor;
    }

    public void setRawTextColor(int rawTextColor) {
        this.rawTextColor = rawTextColor;
    }

    public int getPressedTextColor() {
        return pressedTextColor;
    }

    public void setPressedTextColor(int pressedTextColor) {
        this.pressedTextColor = pressedTextColor;
    }

    public int getDisableTextColor() {
        return disableTextColor;
    }

    public void setDisableTextColor(int disableTextColor) {
        this.disableTextColor = disableTextColor;
    }

    public int getFocusedTextColor() {
        return focusedTextColor;
    }

    public void setFocusedTextColor(int focusedTextColor) {
        this.focusedTextColor = focusedTextColor;
    }

    public int getSelectedTextColor() {
        return selectedTextColor;
    }

    public void setSelectedTextColor(int selectedTextColor) {
        this.selectedTextColor = selectedTextColor;
    }

    public Gradient getGradient() {
        if (gradient == null) {
            gradient = new Gradient();
        }
        return gradient;
    }

    public void setGradient(Gradient gradient) {
        this.gradient = gradient;
    }
}
