package week10.Review;

public class Shape {
    protected String colour = "";
    protected boolean filled = true;
    public String getColor() {
        return colour;
    }
    
    public void setColor(String colour) {
        this.colour = colour;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
}

class Circle extends Shape{
    private double radius = 0;

    
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape{
    private double lengh = 0;
    private double width = 0;
    
    
    public void setLength(double lengh){
        this.lengh = lengh;
    }
    public double getLengh(){
        return lengh;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public double getArea() {
        return lengh * width;
    }
    public double getPerimeter(){
        return (lengh * 2) + (width * 2);
    }
}
