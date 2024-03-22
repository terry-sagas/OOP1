package week10.Review.E4;



interface Drawable {
    void draw();
}

class Circle implements Drawable{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle with radius: " + radius);
    }
}