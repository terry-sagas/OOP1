package week10.Review;

public class Animal {
    public String makeSound(){
        return "No sound";
    }
    public String move(){
        return "No movement";
    }
}
class Dog extends Animal{
    @Override public String makeSound(){
        return "Bark";
    }
}
