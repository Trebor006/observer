package com.mibu.observer;

public interface Subject {
  void subscribe(Observer observer);

  void notifyToCustomers(String notification);
}
