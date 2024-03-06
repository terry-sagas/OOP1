package week8;
public class Apple extends Fruit {
  public Apple() {
      super("Apple");
      System.out.println("Apple's constructor is invoked option 1");
  }

  public Apple(String any) {
      super();
      System.out.println("Apple's constructor is invoked option 2");
  }

  public static void main(String[] args) {
      Apple apple = new Apple();
      Apple apple2 = new Apple("any");
  }
}

class Fruit {
  public Fruit(String name) {
      System.out.println("Fruit's constructor is invoked option 2");
      System.out.println(name);
  }

  public Fruit() {
      System.out.println("Default fruit is Pear");
  }
}
