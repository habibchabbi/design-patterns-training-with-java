package org.example.stateDesignPattern;

public class Phone {
  protected State state;
  public void setState(State state) {
    this.state = state;
  }

  public String lock() {
return "lock";
  }

  public String unlock() {
return "unlock";
  }

  public String home() {
    return "home";
  }

  public String turnOn() {
    return "turn on";
  }
}
