package src.main;

public class Subscriber extends AbstractObserver {
  String lastMsg;
  @Override
  public String update(String msg) {
    lastMsg = msg;
    String ret = String.format("%s: %s\n", this.toString(), lastMsg);
    System.out.println(ret);
    return ret;
  }
}
