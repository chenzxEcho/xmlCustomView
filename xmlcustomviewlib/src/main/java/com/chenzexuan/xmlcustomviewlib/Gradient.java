package com.chenzexuan.xmlcustomviewlib;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;

class Gradient {
  private boolean useGradient;
  private State raw;
  private State pressed;
  private State disable;
  private State foucsed;
  private State selected;

  private float angle;
  private int orientation;
  private int gradientType;


  public boolean isUseGradient() {
    return useGradient;
  }

  public void setUseGradient(boolean useGradient) {
    this.useGradient = useGradient;
  }

  public State getRaw() {
    return raw;
  }

  public void setRaw(State raw) {
    this.raw = raw;
  }

  public State getPressed() {
    return pressed;
  }

  public void setPressed(State pressed) {
    this.pressed = pressed;
  }

  public State getDisable() {
    return disable;
  }

  public void setDisable(State disable) {
    this.disable = disable;
  }

  public State getFoucsed() {
    return foucsed;
  }

  public void setFoucsed(State foucsed) {
    this.foucsed = foucsed;
  }

  public State getSelected() {
    return selected;
  }

  public void setSelected(State selected) {
    this.selected = selected;
  }

  public float getAngle() {
    return angle;
  }

  public void setAngle(float angle) {
    this.angle = angle;
  }

  public boolean hasOrientation() {
    return orientation != 0;
  }

  public Orientation getOrientation() {
    switch (orientation) {
      case 1:
        return Orientation.TOP_BOTTOM;
      case 2:
        return Orientation.LEFT_RIGHT;
      case 3:
        return Orientation.BOTTOM_TOP;
      case 4:
        return Orientation.RIGHT_LEFT;
    }
    return Orientation.TOP_BOTTOM;
  }

  public void setOrientation(int orientation) {
    this.orientation = orientation;
  }

  public int getGradientType() {
    switch (gradientType) {
      case 1:
        return GradientDrawable.LINEAR_GRADIENT;
      case 2:
        return GradientDrawable.RADIAL_GRADIENT;
      case 3:
        return GradientDrawable.SWEEP_GRADIENT;
    }
    return GradientDrawable.LINEAR_GRADIENT;
  }

  public void setGradientType(int gradientType) {
    this.gradientType = gradientType;
  }
}
