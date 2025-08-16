package org.example.chainOfResponsibilitiesDesignPattern;

public class UserExistsHandler extends Handler{

  private DataBase dataBase;
  public UserExistsHandler(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  @Override
  public boolean handle(String userName, String password) {
    return dataBase.isValidUser(userName) || handleNext(userName, password);
  }
}
