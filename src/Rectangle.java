
public class Rectangle extends Shape implements Resizeable {
    public double weight=1.0;
    public double length=1.0;

    public  Rectangle(){

    }
    public Rectangle(String name, String color, double weight, double length){
        //super(name,color);
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.length = length;

    }
    @Override
    public double getArea() {
        return weight*length;
    }

    @Override
    public void Resize(double percent) {
        double weight = this.weight * percent/100;
        double length =this.length * percent/100;
        this.weight += weight;
        this.length += length;
    }
    public String toString(){
        return "the area of " + getName() + ":" + getArea();
    }
}
