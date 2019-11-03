public class Circle extends Shape implements Resizeable {
    public double radius  = 0;

    public  Circle(){

    }
    public  Circle(String name,  String color, double radius){
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public void Resize(double percent) {
        double newRadius = this.radius * percent/100;
        this.radius += newRadius;
    }

    public String toString(){
        return "the area of " + getName() + ":" + getArea();
    }
}
