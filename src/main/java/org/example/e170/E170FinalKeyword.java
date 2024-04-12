package org.example.e170;

class FinalMethod {
    final void display(boolean isFinal) {
        System.out.println("Final method with boolean parameter");
    }

    final void display(String str) {
        System.out.println("Final method with String parameter");
    }
}

public class E170FinalKeyword {

    public static void main(String[] args){

        FinalMethod method = new FinalMethod();

        method.display(false);
        method.display("Hello");

    }

}
