package question.four;

public class Shape {
    public void draw(){
        System.out.println("Drawing Shape....");
    }
    public void erase(){
        System.out.println("Erasing Shape.....");
    }

    public void calculateDrawnArea(float length,float breadth){
        System.out.println("Area using length and breadth: "+(length*breadth)+"m square");
    }

    public void  calculateDrawnArea(float radius){
        System.out.println("Area using radius: "+(Math.PI*radius)+"m square");
    }

    public static void main(String[] args) {
        //Method Overloading (Compile time polymorphism)
        Shape shape=new Shape();
        shape.calculateDrawnArea(4f,5f);
        shape.calculateDrawnArea(1f);
    }
}
