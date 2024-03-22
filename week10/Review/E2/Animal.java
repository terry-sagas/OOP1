package week10.Review.E2;

public class Animal {
    protected String sound = "";
    protected String movement = "";

    public void setSound(String sound){
        this.sound = sound;
    }
    public void setMovement(String movement){
        this.movement = movement;
    }

    public String getSound(){
        return sound;
    }
    public String getMovement(){
        return movement;
    }

    public String makeSound(){
        return "No sound";
    }
    public String move(){
        return "No movement";
    }
}
class Dog extends Animal{
    @Override public String makeSound(){
        return sound;
    }
    @Override public String move(){
        return movement;
    }
}
class Bird extends Animal{
    @Override public String makeSound(){
        return sound;
    }
    @Override public String move(){
        return movement;
    }
}
