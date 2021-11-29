package interfaces;

public class Viber implements Ad,Messanger {

  @Override
  public void sendMessage(String message) {
    System.out.println(message+" sent");
  }

  @Override
  public void showAd() {
    System.out.println("Ad!!");
  }
}
