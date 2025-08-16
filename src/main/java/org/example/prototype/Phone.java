package org.example.prototype;

public class Phone extends ElectronicDevice {
  private boolean isTactile;

  public Phone() {
    super();
  }

  public Phone(boolean isTactile) {
    this.isTactile = isTactile;
  }

  public Phone(Phone phone) {
    super(phone);
    this.isTactile = phone.isTactile;
  }

  @Override
  public Phone clone() {
    System.out.println("Phone.clone()");
    return new Phone(this);
  }
}
