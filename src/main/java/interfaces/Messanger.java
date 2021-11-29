package interfaces;

public interface Messanger {

  public void sendMessage(String message);

  public default void readMassage(String message) {
    System.out.println(message);
  }
}
