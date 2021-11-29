package interfaces;

public class Telegram implements Messanger{

  @Override
  public void sendMessage(String message) {
    System.out.println(message+" sent");
  }

}
