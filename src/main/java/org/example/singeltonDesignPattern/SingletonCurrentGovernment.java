package org.example.singeltonDesignPattern;

public class SingletonCurrentGovernment implements CurrentGovernment {
  private String primeMinister;
  private String status;

  private SingletonCurrentGovernment(){
    System.out.println("constructor");
  }

  public static SingletonCurrentGovernment instance;

  public static synchronized SingletonCurrentGovernment getInstance(){
    if(instance == null) {
      instance = new SingletonCurrentGovernment();
    }

    return instance;
  }
  public String getPrimeMinister() {
    return primeMinister;
  }

  public void setPrimeMinister(String primeMinister) {
    this.primeMinister = primeMinister;
  }


  @Override
  public void rule() {
    System.out.println("i rule");
  }

  @Override
  public void issueOrder() {
    System.out.println("i issue order");

  }

  @Override
  public void resign() {
    System.out.println("i resolve myself");
  }
}
