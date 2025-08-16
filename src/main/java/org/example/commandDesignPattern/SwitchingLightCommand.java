package org.example.commandDesignPattern;

public class SwitchingLightCommand implements Command {
  private final Light light;
  public SwitchingLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.switchLights();
  }
}
