package src.main;

public abstract class AbstractObservable {
  abstract void registerObserver();
  abstract void unregisterObserver();
  abstract void notifyObservers();
}
