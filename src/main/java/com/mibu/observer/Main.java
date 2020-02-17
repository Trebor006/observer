package com.mibu.observer;

public class Main {

  public static void main(String[] args) {
    Observer xiaomi = new Customer("Xiaomi");
    Observer sansumg = new Customer("Sansumg");
    Observer apple = new Customer("Apple");

    CameraDeveloper nikon = new CameraDeveloper();
    nikon.subscribe(xiaomi);
    nikon.subscribe(sansumg);
    nikon.subscribe(apple);

    nikon.releaseNewCamera("New Camera released of 40 MegaPixeles");
    System.out.println("");
    nikon.releaseNewCamera("New Camera released of 120 MegaPixeles");
  }
}
