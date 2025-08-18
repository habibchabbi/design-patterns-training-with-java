package org.example.strategyDesignPattern;

public class StrategyDesignPatternDemo {
  public static void show() {
    System.out.println("strategy design pattern demo");
    PaymentService paymentService = new PaymentService();
    paymentService.setPaymentMethod(new PaymentByCreditCard());
    paymentService.setCosts(100);
    paymentService.processOrderPayment();

  }
}
