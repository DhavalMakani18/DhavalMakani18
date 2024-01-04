import java.util.*;

public class questions_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while(i <= num){
        //     System.out.println(i);
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);


        //Print pattern
        //  ****
        //  ****
        //  ****
        //  ****
        // int n = sc.nextInt();
        // int m = sc.nextInt();   
        // for (int i=0; i<n ; i++){
        //     for(int j = 0; j<m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n = sc.nextInt();
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n / 10;
        // }

        // int n = sc.nextInt();
        // int rev = 0;
        // while(n > 0){
        //     int lastDigit = n % 10;
        //     rev = (rev*10) + lastDigit;
        //     n = n/10;
        // }
        // System.out.println(rev);

        // do {
        //     System.out.print("Enter a Number :  ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        // int i = 0;
        // while (i <10){
            
        //     i++;
        //     if(i==5){
        //         continue;
        //     }
        // System.out.println(i);
        // }

        // for(int j = 1; j <=10; j++){
        //     if(j==5){
        //         continue;
        //     }
        //     System.out.println(j);
        // }

        

        // do {
        //     System.out.println("Enter a number : ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         continue;
        //     }
        //     System.out.println(n);
        // } while(true);

        // int n = sc.nextInt();
    
        // if (n==2){
        //     System.out.println("Number is prime");
        // }
        // else {
        //     boolean isPrime = true;
        //     for ( int i = 2 ; i <= Math.sqrt(n) ; i++){
        //         if(n%i == 0){
        //             isPrime = false;
        //         }
        //     }
        //     if (isPrime == true){
        //         System.out.println("Number is prime");
        //     }
        //     else {
        //         System.out.println("number is not a prime");
        //     }
        // }   


        //sum of odd and even integers

        // System.out.println("Enter a number");
        // int number = sc.nextInt();
        // int evensum = 0 , oddsum = 0;

        // while(number > 0){
        //     if ( number % 2 == 0 ){
        //         evensum = evensum + number;
        //     }
        //     else {
        //         oddsum = oddsum + number;
        //     }
        //     number--;
        // }
        // System.out.println("Even number sum : " + evensum);
        // System.out.println("Odd number sum : " + oddsum);


        // int fact = 1;
        // System.out.println("Enter a number : ");
        // int num = sc.nextInt();
        // for (int i = num ; i > 0 ; i--){
        //     fact = fact * i;
        // }
        // System.out.println(fact);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i = 1 ; i<=10 ; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
