package org.example.e136;

public class E136AccessModifiers {

    private void accessMethod1() {
        System.out.println("This is Private Method");
    }

    void accessMethod2() {
        System.out.println("This is Default Method");
    }

    protected void accessMethod3() {
        System.out.println("This is Protected Method");
    }

    public void accessMethod4() {
        System.out.println("This is Public Method");
    }


    public static void main(String[] args) {

        E136AccessModifiers e1 = new E136AccessModifiers();
        e1.accessMethod1();
        e1.accessMethod2();
        e1.accessMethod3();
        e1.accessMethod4();

    }
}


