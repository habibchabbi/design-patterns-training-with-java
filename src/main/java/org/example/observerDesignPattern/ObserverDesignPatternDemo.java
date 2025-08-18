package org.example.observerDesignPattern;

public class ObserverDesignPatternDemo {
  public static void show() {
    Store store = new Store();
    EmailMsgListener emailMsgListener1 =       new EmailMsgListener("mail 1");

    store.getNotificationService().subscribe(emailMsgListener1);

    EmailMsgListener emailMsgListener2 =       new EmailMsgListener("mail 2");
    store.getNotificationService().subscribe(emailMsgListener2);
    EmailMsgListener emailMsgListener3 =       new EmailMsgListener("mail 3");
    store.getNotificationService().subscribe(emailMsgListener3);

    System.out.println("Observer Design Pattern Demo");
  }
}
