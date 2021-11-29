package inheritance;

public class Horse {

  private String color;
  private int age;

  public Horse(String color, int age) {
    this.color = color;
    this.age = age;
  }

  public Horse() {

  }

  public void eat(String food) {
    System.out.println("I eat " + food);
  }

  public void run(int speed) {
    System.out.println("My speed" + speed);
  }

  public final void sleep(){
    System.out.println("I love to sleep, thank you, master!");
  }
}
