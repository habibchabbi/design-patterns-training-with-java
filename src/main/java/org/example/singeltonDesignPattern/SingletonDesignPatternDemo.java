package org.example.singeltonDesignPattern;

public class SingletonDesignPatternDemo {
  public static void show() {
    SingletonCurrentGovernment currentGovernment = SingletonCurrentGovernment.getInstance();
    SingletonCurrentGovernment currentGovernment2 = SingletonCurrentGovernment.getInstance();
    SingletonCurrentGovernment currentGovernment3 = SingletonCurrentGovernment.getInstance();
    System.out.println(currentGovernment == currentGovernment2);
    System.out.println(currentGovernment == currentGovernment3);
  }
}
