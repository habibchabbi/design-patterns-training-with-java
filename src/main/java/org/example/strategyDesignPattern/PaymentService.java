package org.example.strategyDesignPattern;

public class PaymentService {
  public void setCosts(double costs) {
    this.costs = costs;
  }

  private double costs;
  boolean withDelivery;

  private PaymentMethod paymentMethod;

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void processOrderPayment() {
    paymentMethod.collectPaymentDetails();
    if(paymentMethod.validatePaymentDetails()){
      paymentMethod.pay(getTotal());
    }
  }

  private double getTotal() {
    return withDelivery ? 11+costs: costs;
  }
}
