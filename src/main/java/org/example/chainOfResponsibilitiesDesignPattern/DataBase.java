package org.example.chainOfResponsibilitiesDesignPattern;

public class DataBase {
  public boolean isValidPassword(String username) {
    return true;
  }

  public boolean isValidUser(String username) {
    return true;
  }
}
