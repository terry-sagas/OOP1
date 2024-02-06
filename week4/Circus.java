package week4;
class Circle {
    private double radius;
    
    public Circle() {
        radius = 10;
    }
    
    public void increaseRadius() {
        radius += 5;
    }
    
    public void printRadius() {
        System.out.println("The radius equals " + radius);
    }
}

public class Circus {

    public Circle juggle(Circle updatedCircle) {
        updatedCircle.increaseRadius();
        Circle createdCircle = new Circle();
        return createdCircle;
    }
    
    public static void main(String[] args) {
        Circus circus = new Circus();
        Circle firstCircle = new Circle(); // radius set to 10
        Circle secondCircle;
        secondCircle = circus.juggle(firstCircle); 
        // first circle radius is now 15 but returned circle is new circle with radius 10
        secondCircle.printRadius();
        firstCircle.printRadius(); // radius equals 15

        Circle thirdCircle;

        thirdCircle = circus.juggle(secondCircle);
        firstCircle.printRadius();
        secondCircle.printRadius();
        thirdCircle.printRadius();
    }
}
