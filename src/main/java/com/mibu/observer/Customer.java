package com.mibu.observer;

public class Customer implements Observer {

  private String companyName;

  public Customer(String companyName) {
    this.companyName = companyName;
  }

  @Override
  public void update(String notification) {
    System.out.printf("Mail of %s, existe la siguiente notification : %s\n", this.companyName, notification);
  }
}
