package org.example.strategyDesignPattern;

public class PaymentByCreditCard implements PaymentMethod {
  private CreditCard card;

  @Override
  public void collectPaymentDetails() {
  card = new CreditCard("1111", "habib", "12345", "185");
  }

  @Override
  public boolean validatePaymentDetails() {
    return false;
  }

  @Override
  public void pay(double amount) {
    CreditCard card = new CreditCard("123456", "mmmm",  "", "185");
    System.out.println("payment by credit card " + amount);
  }
}
