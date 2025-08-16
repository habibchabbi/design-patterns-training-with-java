package org.example.prototype;

public abstract class ElectronicDevice implements Cloneable {
  private String brandName;
  private String modelName;
  private String type;

  public ElectronicDevice() {
  }

  public ElectronicDevice(ElectronicDevice electronicDevice) {

  }


  public void setType(String type) {
    this.type = type;
  }


  public String getType() {
    return type;
  }

  public abstract ElectronicDevice clone();

}
