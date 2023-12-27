import java.util.*;

public class JavaBAsics {
    public static void main(String[] args) {
        
        //Print a star pattern 

        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 4 - i ; j++){ 
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Datatypes in java
        1. Primitive => byte , short , char , boolean , int , long , float , double ...Total 8 Type
        2. Non-Primitive => string , array , class , object , interface ...Total 5 Type  
        */

        //print a sum of two number

        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println(sum);

        //print a given string

        String name = "Tony Starc";
        System.out.println(name);

        //sum of two number with user input

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int Add = x + y;
        System.out.println(Add);

        //product of two variable

        int mul = x * y;
        System.out.println(mul);

        //area of circle

        float r = sc.nextFloat();
        float PI = 3.14f;
        float area = PI * r * r;
        System.out.println("the area is " + area);

        //type promotion

        char d = 'd';     // d= 100 convert into int
        short e = 50;    // convert into int
        System.out.println(d+e);   // 150  

        char f = 'f';   //102
        System.out.println(f-d);   //2
    }
}
