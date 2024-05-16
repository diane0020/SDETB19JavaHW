package org.example.e177;
interface iOutputs {
    void display(double myResult);
}

interface iFunctions extends iOutputs {
    double adding(double firstNumber , double secondNumber);
    double subtracting(double firstNumber , double secondNumber);
    double multiply(double firstNumber , double secondNumber);
    double dividing(double firstNumber , double secondNumber);
}

class MyClass implements iFunctions {

    @Override
    public void display(double myResult) {
        System.out.println("Result is ::: " + myResult);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
public class E177MultipleInterface {

    public static void main(String[] args){
        MyClass myClass = new MyClass();

        double num1 = 100, num2 = 20;
        myClass.display(myClass.adding(num1,num2));
        myClass.display(myClass.subtracting(num1,num2));
        myClass.display(myClass.multiply(num1,num2));
        myClass.display(myClass.dividing(num1,num2));

    }
}
