package week10.Review.E3;


public class Vehicle {
    float speed = 0;
    String action = "";

    public void setSpeed(float speed){
        this.speed = speed;
    }
    public void setAction(String action){
        this.action = action;
    }
    public float getSpeed(){
        return speed;
    }
    public String getAction(){
        return action;
    }

    public void drive(){
        System.out.println("Top Speed: " +"No vehicle selected");
        System.out.println("Action: " + "No Vehicle selected");
    }
    
}

class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Top Speed: " + speed + "kph");
        System.out.println("Action: " + action + "kph");
        System.out.println("Vroom Vroom");
    }
}

class Bike extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Top Speed: " + speed);
        System.out.println("Action: " + action);
        System.out.println("Keep pedaling!");
    }
}