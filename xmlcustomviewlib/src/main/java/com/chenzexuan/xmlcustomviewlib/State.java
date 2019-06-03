package com.chenzexuan.xmlcustomviewlib;

class State {
  private int startColor;
  private int centerColor;
  private int endColor;

  public int getStartColor() {
    return startColor;
  }

  public void setStartColor(int startColor) {
    this.startColor = startColor;
  }

  public int getCenterColor() {
    return centerColor;
  }

  public void setCenterColor(int centerColor) {
    this.centerColor = centerColor;
  }

  public int getEndColor() {
    return endColor;
  }

  public void setEndColor(int endColor) {
    this.endColor = endColor;
  }

  public int[] getColors() {
    if (centerColor != 0) {
      return new int[] {startColor, centerColor, endColor};
    }
    return new int[] {startColor, endColor};
  }
}
