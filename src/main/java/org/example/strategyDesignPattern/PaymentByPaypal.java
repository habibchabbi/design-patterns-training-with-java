package org.example.strategyDesignPattern;

public class PaymentByPaypal implements PaymentMethod {
  @Override
  public void collectPaymentDetails() {
    String email = "email";
    String password = "password";
  }

  @Override
  public boolean validatePaymentDetails() {
    return false;
  }

  @Override
  public void pay(double amount) {

  }
}
