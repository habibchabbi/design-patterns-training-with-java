package org.example.mediatorDesignPattern;

public class Dialog implements Mediator {
  private TextBox user;
  private TextBox pass;
  private LoginButton button;

  public Dialog(TextBox user, TextBox pass, LoginButton button) {
    this.user = user;
    this.pass = pass;
    this.button = button;
  }

  @Override
  public void login() {
    String userName = user.getText();
    String password = pass.getText();
  }
}
