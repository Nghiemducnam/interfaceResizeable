public class Main {
    public static void main(String[] args) {

        int percent = (int) (Math.floor(Math.random() * 100) + 1);
        Shape [] shapes = new Shape[3];
        shapes[0] = new Rectangle("hcn1","blue",2.0,3.0);
        shapes[1] = new Square("square1","yellow",2.0);
        shapes[2] =  new Circle("circle1", "green",1.0);

        for( int i =0; i<shapes.length;i++){
            System.out.println("the area before is: " + shapes[i].getName() + ":" + shapes[i].getArea());
        }

        System.out.println("-------------------------------------------");

        for( int j = 0; j< shapes.length; j++){
            Resizeable resizeable = (Resizeable) shapes[j];
            resizeable.Resize(100);
            System.out.println("the area after is: "+ shapes[j].getName()+ ":" + shapes[j]);
        }


    }
}

