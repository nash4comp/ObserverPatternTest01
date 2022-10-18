package src.main;

public class Main {

  public static void main(String[] args) {
    Publisher publisher = new Publisher();
    Subscriber subscriber1 = new Subscriber();
    Subscriber subscriber2 = new Subscriber();
    Subscriber subscriber3 = new Subscriber();

    publisher.registerObserver(subscriber1);
    publisher.registerObserver(subscriber2);
    publisher.registerObserver(subscriber3);

    publisher.notifyObservers("Hello!");
    publisher.notifyObservers("World!");

  }
}
