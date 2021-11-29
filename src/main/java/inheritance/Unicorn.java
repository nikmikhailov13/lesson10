package inheritance;

public class Unicorn extends Horse {

  boolean hasWings;

  public Unicorn(String color, int age) {
    super(color, age);
    this.hasWings = true;
  }

  public boolean canFly() {
    return true;
  }

  @Override
  public void eat(String food) {
    System.out.println("I don't eat  " + food + " because i'm Unicorn");
  }

}
