package org.example.e176;
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }
}
public class E176MultipleInterface {

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.parentMethod();
        myClass.childMethod();
    }
}


