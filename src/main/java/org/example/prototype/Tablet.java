package org.example.prototype;

public class Tablet  extends ElectronicDevice {
  private String size;
  public Tablet() {
  }

  public Tablet(Tablet tablet) {
    super(tablet);
    this.size = tablet.size;
  }

  @Override
  public Tablet clone() {
    System.out.println("Tablet.clone()");
    return new Tablet(this);
  }
}
