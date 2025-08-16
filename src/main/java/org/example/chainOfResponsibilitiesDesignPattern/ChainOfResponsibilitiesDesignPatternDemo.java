package org.example.chainOfResponsibilitiesDesignPattern;

public class ChainOfResponsibilitiesDesignPatternDemo {
  public static void show() {
    System.out.println("Chain of Responsibilities Design Pattern Demo");
    DataBase dataBase = new DataBase();
    Handler handler = new UserExistsHandler(dataBase).
      setNextHandler(new ValidPasswordHandler(dataBase))
      .setNextHandler(new RoleCheckHandler());
    AuthenticateService authenticateService = new AuthenticateService(handler);
    authenticateService.logIn("admin8userName","123456");
  }
}
