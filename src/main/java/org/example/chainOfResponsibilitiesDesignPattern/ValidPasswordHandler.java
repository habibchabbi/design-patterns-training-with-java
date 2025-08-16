package org.example.chainOfResponsibilitiesDesignPattern;

public class ValidPasswordHandler extends Handler{

  private DataBase dataBase;
  public ValidPasswordHandler(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  @Override
  public boolean handle(String userName, String password) {
    return dataBase.isValidPassword(userName) || handleNext(userName, password);
  }
}
