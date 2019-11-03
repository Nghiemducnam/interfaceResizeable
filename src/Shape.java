public abstract class Shape {
    public String color = "red";
    public String name = "shape1";

    public String getColor(){
        return color;
    }
    public void setColor( String color){
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public  void setName(){
        this.name = name;
    }

    public abstract double getArea();

    public Shape(){
    }
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    public String toString(){
        return "the area is" + getArea();
    }

}
