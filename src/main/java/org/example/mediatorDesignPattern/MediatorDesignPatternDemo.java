package org.example.mediatorDesignPattern;

import java.awt.event.ActionEvent;

public class MediatorDesignPatternDemo {
  public static void show() {
     TextBox userName = new TextBox();
     TextBox password = new TextBox();
     LoginButton loginButton = new LoginButton();
     loginButton.setMediator(new Dialog(userName, password, loginButton));
     loginButton.fireActionPerformed(new ActionEvent(new Object(), 0, "login"));
  }
}
