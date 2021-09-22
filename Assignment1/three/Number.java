package question.three;

import java.util.Scanner;

public class Number {
    private int input;

    public Number(int input){
        this.input=input;
    }
    public boolean isZero(){
        if(input==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPositive(){
        if(input>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isNegative(){
        if(input<0){
            return true;
        }
        else{
            return false;
        }
    }

    public  boolean isOdd(){
        if(input%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public  boolean isEven(){
        if(input%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isPrime(){
        boolean isPrime=true;
        if(input==0 || input==1){
            return false;
        }
        else{
            for(int i=2;i<=(input/2);i++){
                if(input%2==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                return true;
            }
            else{
                return false;
            }

        }
    }

    public boolean isArmStrong(){
        int digits=0,sum=0,tempInput=input;
        while(tempInput>0){
            tempInput=tempInput/10;
            digits++;
        }
        tempInput=input;
        while(tempInput>0){
            int remainder=tempInput%10;
            sum+=Math.pow(remainder,digits);
            tempInput=tempInput/10;
        }
        if(sum==input){
            return true;
        }
        else{
            return false;
        }
    }

    public int getFactorial(){
        int factorial=1;
        for(int i=input;i>0;i--){
            factorial=factorial*i;
        }
        return factorial;
    }

    public  int getSqr(){
        return input*input;
    }

    public int getReverse(){
        int reverse=0,tempInput=input;
        while(tempInput!=0){
            int remainder=tempInput%10;
            reverse=reverse*10+remainder;
            tempInput=tempInput/10;
        }
        return reverse;
    }

    public int sumDigits(){
        int sum=0,tempInput=input;
        while(tempInput>0){
            int remainder=tempInput%10;
            sum+=remainder;
            tempInput=tempInput/10;
        }
        return sum;
    }

    public double getSqrt(){
        return Math.sqrt(5);
    }

    public static void main(String[] args) {
       Number number=new Number(153);
        System.out.println("----------Given Input Details----------");
        System.out.println("Is Zero: "+number.isZero());
        System.out.println("Is Odd: "+number.isOdd());
        System.out.println("Is Even: "+number.isEven());
        System.out.println("Is Positive: "+number.isPositive());
        System.out.println("Is Negative: "+number.isNegative());
        System.out.println("Is prime: "+number.isPrime());
        System.out.println("Is ArmStrong: "+number.isArmStrong());
        System.out.println("Factorial: "+number.getFactorial());
        System.out.println("Square: "+number.getSqr());
        System.out.println("Reverse: "+number.getReverse());
        System.out.println("Sum of Digits: "+number.sumDigits());
        System.out.println("Square Root: "+number.getSqrt());
    }
}
