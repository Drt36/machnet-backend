package question.four;

public class Triangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Triangle....");
    }

    @Override
    public void erase(){
        System.out.println("Erasing Triangle...");
    }

    public static void main(String[] args) {
        //Method Overriding (Runtime polymorphism)
        Shape shape=new Triangle();
        shape.draw();
        shape.erase();
    }
}
