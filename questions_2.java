import java.util.*;

public class questions_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        int a = 1, b = 3;

        if(a > b){
            System.out.println("A is greater");
        }
        else {
            System.out.println("B is greater");
        }
        */

        /* 
        
        int a = sc.nextInt();

        if(a%2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        */

        /*
         
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int)(income * 0.2);
        }
        else {
            tax = (int)(income * 0.3);
        }

        System.out.println("The tax is " + tax);
        */

        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // if(a > b){
        //     if(a > c){
        //         System.out.println("a is big");
        //     }
        //     else{
        //         System.out.println("c is big");
        //     }
        // }

        // else if(b > a){
        //     if(b > c){
        //         System.out.println("b is big");
        //     }
        //     else{
        //         System.out.println("c is big");
        //     }
        // }   
        
        // if(a >= b && a >= c){
        //     System.out.println("a is big");
        // }
        // else if(b >= c){
        //     System.out.println("b is big");
        // }
        // else {
        //     System.out.println("c is big");
        // }
        */

        /* 
        
        int marks = sc.nextInt();

        String check = (marks >= 33) ? "pass" : "fail";
        System.out.println(check);
        */

        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            case '%':
                System.out.println(a % b);
                break;
        
            default:
                System.out.println("The operator is not well defined");
                break;
        }
        */

        /* 
        double temp = sc.nextDouble();

        String cal = (temp>100) ? "You have a fewer" : "You don't have a fewer";
        System.out.println(cal);
        */

        /* 

        System.out.println("Enter week number(1-7): ");
        int week = sc.nextInt();
        
        switch(week) {
            case 1 :System.out.println("Monday");
                    break;
            case 2 : System.out.println("Tuesday");
                    break;
            case 3 :System.out.println("Wednesday");
                    break; 
            case 4 :System.out.println("Thursday");
                    break; 
            case 5 :System.out.println("Friday");
                    break;
            case 6 :System.out.println("Saturday");
                    break;
            case 7 :System.out.println("Sunday");
                    break;
            default : 
                    System.out.println("Invalidinput!Pleaseenterweeknumberbetween1-7.");
        }
        */

        /* */
        System.out.println("Enter the year");
        int year = sc.nextInt();

        // if(year % 4 == 0){
        //     if(year % 100 == 0){
        //         if(year % 400 == 0){
        //             System.out.println("Leap Year");
        //         }
        //         else {
        //             System.out.println("Not Leap Year");
        //         }
        //     }
        //     else {
        //         System.out.println("Leap Year");
        //     }
        // }
        // else {
        //     System.out.println("Not Leap Year");
        // }

        if(year % 4 == 0 &&  year % 100 != 00 || year % 400 == 0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
    }
    
}
