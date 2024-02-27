package org.example.e22;

import java.util.Scanner;

public class E22ScannerClass {

    /*
    Write a program to take username, age and mobile number
First Output: "Enter your name"
Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
Third Output: "Enter your age"


**Output:**

```
Enter your name
Enter your mobile number
Enter your age
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890
```
     */
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter your name");
        System.out.println("Enter your mobile number" );
        System.out.println("Enter your age");

        //Getting the input from the user

        String userName = user.nextLine();
        String userPhone = user.nextLine();
        int userAge = user.nextInt();

        System.out.println("Your name is " + userName + ", your age is " + userAge + " and your mobile number is " + userPhone);


    }
}
