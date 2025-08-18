package org.example.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
  private final List<EmailMsgListener> customers;

  public NotificationService() {
    customers = new ArrayList<EmailMsgListener>();
  }

  public void subscribe(EmailMsgListener listener) {
    customers.add(listener);

  }

  public void unsubscribe(EmailMsgListener listener) {
    customers.remove(listener);
  }

  public void notify1() {
    customers.forEach(EmailMsgListener::update);
  }
}
