public class Square extends Shape implements Resizeable {
    public double side;

    public Square(){

    }
     public Square(String name, String color, double side){
        this.name = name;
        this.color = color;
        this.side= side;

    }

    @Override
    public double getArea() {
        return side*4;
    }

    @Override
    public void Resize(double percent) {
        double side = this.side * (percent/100);
        this.side += side;

    }
    public String toString(){
        return "the area of " + getName() + ":" + getArea();
    }
}
