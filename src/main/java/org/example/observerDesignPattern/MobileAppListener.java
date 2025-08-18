package org.example.observerDesignPattern;

public class MobileAppListener implements EventListener {
  private final String userName;

  public MobileAppListener(String userName) {
    this.userName = userName;
  }


  @Override
  public void update() {
    System.out.println("App listner update " + userName);

  }
}
