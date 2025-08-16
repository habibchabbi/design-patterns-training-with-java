package org.example.chainOfResponsibilitiesDesignPattern;

public class RoleCheckHandler extends Handler {

  @Override
  public boolean handle(String userName, String password) {
    System.out.println("last handler");
    return "admin_userName".equals(userName) || handleNext(userName, password);
  }
}
