package src.main;

import java.util.ArrayList;

public abstract class AbstractObservable {

  ArrayList<Subscriber> observers;
  abstract void registerObserver(Subscriber observer);
  abstract void unregisterObserver(Subscriber observer);
  abstract void notifyObservers(String msg);
}
