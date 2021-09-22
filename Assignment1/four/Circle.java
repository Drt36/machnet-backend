package question.four;
public class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Circle...");
    }

    @Override
    public void erase(){
        System.out.println("Erasing Circle...");
    }

    public static void main(String[] args) {
        //Method Overriding (Runtime polymorphism)
        Shape shape=new Circle();
        shape.draw();
        shape.erase();
    }
}
