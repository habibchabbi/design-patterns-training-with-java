package org.example.commandDesignPattern;

public class Light {
  private boolean isSwitchedOn;

  public boolean isSwitchedOn() {
    return isSwitchedOn;
  }
  public void setSwitchedOn(boolean isSwitchedOn) {
    this.isSwitchedOn = isSwitchedOn;
  }

  public void switchLights() {
isSwitchedOn = !isSwitchedOn;
  }
}
