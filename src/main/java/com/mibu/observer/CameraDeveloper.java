package com.mibu.observer;

import java.util.ArrayList;
import java.util.List;

public class CameraDeveloper implements Subject {

  private List<Observer> observers;

  public CameraDeveloper() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void subscribe(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void notifyToCustomers(String notification) {
    for (Observer observer : this.observers) {
      observer.update(notification);
    }
  }

  public void releaseNewCamera(String notification) {
    notifyToCustomers(notification);
  }
}
