package org.example.stateDesignPattern;

import javax.swing.*;

public class StateDesignPatternDemo {
  public static void show() {
    Phone phone = new Phone();
    State OffState = new OffState(phone);
    phone.setState(OffState);
    JButton homeButton = new JButton("Home");
    homeButton.addActionListener(e -> phone.state.onHome());
    JButton onOffButton = new JButton("On Off");
    onOffButton.addActionListener(e -> phone.state.onOffOn());
    System.out.println("state design pattern demo");
    phone.state.onOffOn();
    System.out.println(phone.state.toString());
    phone.state.onHome();
    System.out.println(phone.state.toString());
    phone.state.onOffOn();
    System.out.println(phone.state.toString());
  }
}
