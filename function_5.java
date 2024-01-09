import java.util.*;

public class function_5 {

    // public static void swap(int x, int y){
    //     int temp = x;
    //     x = y;
    //     y = temp;
    //     System.out.println("x " + x);
    //     System.out.println("y " + y);
    // }


    // public static int factorial(int n, int fact){
    //     for(int i=n; i>=1; i--){
    //         fact = fact * i;
    //     }
    //     return fact;
    // }


    // public static int fact(int n){
    //     int fact = 1;
    //     for(int i=1; i<=n; i++){
    //         fact = fact * i;
    //     }
    //     return fact;
    // }
    // public static int binomial(int n, int r){
    //     int bino = fact(n) / (fact(r) * fact(n-r));
    //     return bino;
    // }


    // public static boolean isPrime(int n){
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;   
    // }
    //       OPTIMIZE METHOD
    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i=2; i<= Math.sqrt(n); i++){
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void primeInRange(int n){
    //     for(int i=2; i<=n; i++){
    //         if(isPrime(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    //     System.out.println();
    // }

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of A and B : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // int a = 5;
        // int b = 10;
        // swap(a, b);
        // System.out.println("a " + a);
        // System.out.println("b " + b);


        // int prod = productPrint(a,b);
        // System.out.println(prod);


        // int fac = factorial(5, 1);
        // System.out.println(fac);


        // int bino = binomial(5,2);
        // System.out.println(bino);


        // primeInRange(20);

        //for palindron
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int pali = num;
        // int rev = 0;
 
        // while(pali!=0)
        // {
        //     rev = rev*10;
        //     rev = rev + (pali%10);
        //     pali = pali/10;
        // }
        // if(num == rev) 
        // {
        //     System.out.println("The number is palindrome");
        // }
        // else{
        //     System.out.println("The number is not palindrome");
        // }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int calls = sum(a);
        System.out.println(calls);
        
        sc.close();
    }

    public static int sum(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num = num / 10;
        }
        return sum;
    }

}