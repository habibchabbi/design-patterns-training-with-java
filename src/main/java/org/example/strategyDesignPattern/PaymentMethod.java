package org.example.strategyDesignPattern;

public interface PaymentMethod {
  public void collectPaymentDetails();
  public boolean validatePaymentDetails();
  public void pay(double amount);
}
