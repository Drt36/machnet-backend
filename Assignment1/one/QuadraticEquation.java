package question.one;

import java.util.Scanner;

public class QuadraticEquation {
    public void calculateQuadraticEquation(double a,double b, double c){
        double root1;
        double root2;
        double determinant=(b*b)-(4*a*c);

        if(determinant==0){
            root1=-b/(2*a);
            root2=root1;

            System.out.println("Both roo1 and root2 are equal and root is: "+root2);
        }
        else if(determinant>0){
            root1=(-b+Math.sqrt(determinant))/(2*a);
            root2=(-b-Math.sqrt(determinant))/(2*a);

            System.out.println("Root1 is: "+root1);
            System.out.println("Root2 is"+root2);
        }
        else{
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-determinant);

            System.out.println("Root 1 is: "+real+"+"+imaginary+"i");
            System.out.println("Root 2 is: "+real+"-"+imaginary+"i");
        }
        }

    public static void main(String args[]){
    QuadraticEquation quadraticEquation=new QuadraticEquation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quadratic Equation: ax^2+bx+c=0");
        System.out.println("Enter the a : ");
        double a=scanner.nextDouble();

        System.out.println("Enter the b : ");
        double b=scanner.nextDouble();

        System.out.println("Enter the c : ");
        double c=scanner.nextDouble();

        quadraticEquation.calculateQuadraticEquation(a,b,c);

    }
}
