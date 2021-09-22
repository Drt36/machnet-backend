package question.four;

public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing Square....");
    }

    @Override
    public void erase(){
        System.out.println("Erasing Square....");
    }

    public static void main(String[] args) {
        //Method Overriding (Runtime polymorphism)
        Shape shape=new Square();
        shape.draw();
        shape.erase();
    }
}
