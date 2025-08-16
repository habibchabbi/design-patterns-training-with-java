package org.example.chainOfResponsibilitiesDesignPattern;

public class AuthenticateService {

  private Handler handler;
  public AuthenticateService(Handler handler){
    this.handler=handler;
  }

  public boolean logIn(String username,String password){
    if(handler.handle(username,password)){
      System.out.println("authorized");
      return true;
    }
    return false;
  }
}
