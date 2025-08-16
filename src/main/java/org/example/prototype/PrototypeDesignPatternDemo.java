package org.example.prototype;

import java.util.List;

public class PrototypeDesignPatternDemo {
  public static void show() {
  List<ElectronicDevice> devices = List.of(
    new Phone(),
    new Computer(),
    new Tablet()
  );

  for (ElectronicDevice device : devices) {
    System.out.println(device.clone());
  }
  }
}
