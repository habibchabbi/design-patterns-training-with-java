package org.example.observerDesignPattern;

public class Store {
  private final NotificationService notficationService;

  public Store() {
    this.notficationService = new NotificationService();
  }

  public void newItemPromotion() {
    notficationService.notify();
  }

  public NotificationService getNotificationService() {
    return notficationService;
  }
}
