package org.example.commandDesignPattern;

public class Room {
  //private Light light;
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void executeCommand() {
    command.execute();
  }
/*
  public Room() {
    light = new Light();
  }

  public void switchLight() {
    light.setSwitchedOn(!light.isSwitchedOn());
  }
  */
}
