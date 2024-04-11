package org.example.e138;

class E138Methods {
       private void privateMethod() {
              System.out.println("private");
       }

       void defaultMethod() {
              System.out.println("default");
       }

       protected void protectedMethod() {
              System.out.println("protected");
       }

       public void publicMethod() {
              System.out.println("public");
       }
}
public class E138AccessModifiers {

       public static void main(String[] args) {

              E138Methods e138 = new E138Methods();
              e138.defaultMethod();
              e138.protectedMethod();
              e138.publicMethod();


       }
}
