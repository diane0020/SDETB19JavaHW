package org.example.e164;

class Parent {
    void hello() {
        System.out.println("method in Parent class");
    }
}

class Child1 extends Parent {
    @Override
    void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child2 extends Parent {
    @Override
    void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child3 extends Parent {
    @Override
    void hello() {
        System.out.println("method in Child3 class");
    }
}
public class E164MethodOverriding {
    public static void main(String[] args) {
        Parent [] children = {new Child1(), new Child2(), new Child3()};

        for (Parent child : children) {
            child.hello();
        }
    }

}



