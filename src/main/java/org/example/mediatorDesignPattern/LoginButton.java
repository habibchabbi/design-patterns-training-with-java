package org.example.mediatorDesignPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton  implements Component {
  private Mediator mediator;

  @Override
  protected void fireActionPerformed(ActionEvent event) {
    mediator.login();
  }

  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
}
