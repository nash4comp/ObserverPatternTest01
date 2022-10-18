package src.main;

import java.util.ArrayList;

public class Publisher extends AbstractObservable {
  public Publisher() {
    this.observers = new ArrayList<Subscriber>();
  }

  @Override
  void registerObserver(Subscriber observer) {
    this.observers.add(observer);
  }

  @Override
  void unregisterObserver(Subscriber observer) {
    this.observers.remove(observer);
  }

  @Override
  void notifyObservers(String msg) {
    for (Subscriber sub : this.observers) {
      sub.update(msg);
    }

  }
}
