package org.example.e173;
abstract class Tea {
    private String teaType;

    Tea(String teaType){
        this.teaType = teaType;
    }

    abstract void addSugar();
}

class LemonTea extends Tea {

    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}

class ChaiTea extends Tea {

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For Chai Tea we need 1 spoon of sugar");
    }
}
public class E173AbstractClass {
    public static void main(String[] args) {

        Tea [] teaType = {new LemonTea("Lemon Tea"), new ChaiTea("Chai Tea")};

        for (Tea tea : teaType) {
            tea.addSugar();
        }
    }

    }



