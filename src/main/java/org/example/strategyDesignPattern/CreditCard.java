package org.example.strategyDesignPattern;

public class CreditCard {
  private String number;
  private String holderName;
  private String expirationDate;
  private String cvv;

  public CreditCard(String number, String holderName, String expirationDate, String cvv) {
    this.number = number;
    this.holderName = holderName;
    this.expirationDate = expirationDate;
    this.cvv = cvv;
  }

 private Double amount;

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }
}
