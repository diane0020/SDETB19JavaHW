package org.example.e142;

class SytaxTechnologies {
    protected String schoolName;
    protected int batch;
    protected int year;
    protected String lastDayOfClass;

    SytaxTechnologies() {
    }

    SytaxTechnologies (String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    void printInfo() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}

public class E142Constructor {
    public static void main(String[] args) {

        SytaxTechnologies e142 = new SytaxTechnologies();
        e142.printInfo();
        SytaxTechnologies e142a = new SytaxTechnologies("Syntax",6,2020,"07/30/2020");
        e142a.printInfo();

    }
}

