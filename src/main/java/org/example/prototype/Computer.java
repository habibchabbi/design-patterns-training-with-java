package org.example.prototype;

public class Computer extends ElectronicDevice {
  private Boolean isLaptop;

  public Computer() {
    super();
  }

  public Computer(Computer computer) {
    super(computer);

  }
  @Override
  public Computer clone() {
    System.out.println("Computer.clone()");
    return new Computer(this);
  }


}
