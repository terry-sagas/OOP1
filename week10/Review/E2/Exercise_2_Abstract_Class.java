package week10.Review.E2;

public class Exercise_2_Abstract_Class {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        dog.setSound("Bark");
        bird.setMovement("Tweet");
        dog.setMovement("Run on 4 legs");
        bird.setSound("Flying");

        System.out.println("Dog: " + dog.move());
        System.out.println("Bird: " + bird.move());
        System.out.println("Dog: " + dog.makeSound());
        System.out.println("Bird: " + bird.makeSound());

        

    }
}
