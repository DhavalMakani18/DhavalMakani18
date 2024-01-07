import java.util.*;

public class questions_4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //SIMPLE STAR PATTERN
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //         or
        // int st = 1;
        // int no_of_line = 1;
        // while(no_of_line <=n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     st++;
        //     no_of_line++;
        // }



        // SIMPLE INVERTED-STAR PATTERN
        // for(int i = n ; i >= 1 ; i--){
        //     for(int j = i ; j >= 1 ; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        //              OR
        // int st = n;
        // int no_of_line = 1;
        // while(no_of_line <=n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     st--;
        //     no_of_line++;
        // }

        // HALF-PYRAMID
        // for(int i = 1 ; i <=n ; i++){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        //             OR
        // int st = 1;
        // int no_of_line = 1;
        // while(no_of_line <= n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        //     st++;
        //     no_of_line++;
        // }

        // CHARACTER PATTERN
        // System.out.println("Enter a Starting Character");
        // char ch = sc.next().charAt(0);
        // for(int i = 1 ; i<= n ; i++){
        //     for(int j = 1 ; j <= i; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        //                 OR
        // System.out.println("Enter a Starting Character");
        // char ch = sc.next().charAt(0);
        // int st = 1;
        // int no_of_line = 1;
        // while(no_of_line <=n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        //     st++;
        //     no_of_line++;
        // }


        //HOLLOW RECTANGLE pattern
        // for(int i = 1 ; i <= n-1 ; i++){
        //     for(int j = 1; j <= n ; j++){
        //         if( i == 1 || i == n-1 || j == 1 || j == n){
        //             System.out.print("*");
        //         }
        //         else {
        //         System.out.print(" ");
        //         }    
        //     }  
        //     System.out.println();  
        // }
        //                 OR
        // int st = 1;
        // int sp = n-2;
        // int no_of_lines = 1;
        // while(no_of_lines<=n-1){
        //     if(no_of_lines == 1 || no_of_lines == n-1){
        //         for(int i = 1; i<=n; i++){
        //             System.out.print("* ");
        //         }     
        //     }
        //     else {
        //         //for line no 2 to n-2
        //         //for first star
        //         for(int i = 1; i<= st; i++){
        //             System.out.print("* ");
        //         }
        //         //for spaces
        //         for(int i = 1; i<= sp; i++){
        //             System.out.print("  ");
        //         }
        //         //for last star
        //         for(int i = 1; i<= st; i++){
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        //     no_of_lines++;  
        // }


        // INVERTED & ROTATED HALF-PYRAMID pattern
        //    int st = 1;
        //    int sp = n-1;
        //    int no_of_line = 1;
        //    while(no_of_line <= n){
        //         //print spaces
        //         for(int i=1; i<=sp; i++){
        //             System.out.print("  ");
        //         }
        //         //print star
        //         for(int i=1; i<=st; i++){
        //             System.out.print("* ");
        //         }
        //         System.out.println();
        //         no_of_line++;
        //         st++;
        //         sp--;
        //    }

        

        // INVERTED HALF-PYRAMID with Numbers pattern
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j <=i; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        //                    OR
        // int st = n;
        // int no_of_line = 1;
        // while (no_of_line <=n) {
        //     for(int i=1; i<=st; i++){
        //         System.out.print(i);
        //     }
        //     System.out.println();
        //     st--;
        //     no_of_line++;  
        // }

        // FLOYD'S Triangle pattern
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        //             Or
        // int num = 1;
        // int st = 1;   // st use for the first line 1 star 2nd line 2 star
        // int no_of_line = 1;
        // while(no_of_line <=n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        //     st++;
        //     no_of_line++;
        // }


        //0-1 TRIANGLE PATTERN
        // int st = 1;
        // int no_of_line = 1;
        // while(no_of_line <= n){
        //     for(int i=1; i<=st; i++){
        //         if((no_of_line + i) % 2 == 0){
        //             System.out.print(1 + " ");
        //         }
        //         else {
        //             System.out.print(0 + " ");
        //         }
        //     }
        //     System.out.println();
        //     st++;
        //     no_of_line++;
        // }


        // BUTTERFLY pattern
        // int st = 1;
        // int sp = 2*n -2;
        // int no_of_line = 1;
        // while(no_of_line <=2*n){
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     for(int i=1; i<=sp; i++){
        //         System.out.print("  ");
        //     }
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     if(no_of_line < n){
        //         st++;
        //         sp = sp - 2;
        //     }
        //     else if(no_of_line > n){
        //         st --;
        //         sp = sp + 2;
        //     }
        //     System.out.println();
        //     no_of_line++;
        // }



        // SOLID RHOMBUS pattern
        // int st = n;
        // int sp = n-1;
        // int no_of_line = 1;
        // while(no_of_line <=n){
        //     for(int i=1; i<=sp; i++){
        //         System.out.print("  ");
        //     }
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     sp--;
        //     no_of_line++;
        // }



        // HOLLOW RHOMBUS pattern
        // int number_of_line = 1;
        // int osp = n - 1;  // first place spaces
        // int isp = n - 2;  // innear spaces
        // while(number_of_line<=n){
        //     // print outer spaces
        //     for(int i=1; i<=osp; i++){   // this is common loop work for both
        //         System.out.print("  ");
        //     }
        //     if(number_of_line == 1 || number_of_line == n){     
        //         for(int i=1; i<=n; i++){
        //             System.out.print("* ");
        //         }       
        //     } else {
        //         // print stars 
        //         System.out.print("* ");
        //         // print inner spaces
        //         for(int i=1; i<=isp; i++){
        //             System.out.print("  ");
        //         }
        //         // print star
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     osp--;
        //     number_of_line++;
        // }



        // DIAMOND pattern
        // int st = 1;
        // int sp = n-1;
        // for(int no_of_line = 1;no_of_line <= 2*n-1;no_of_line++){
        //     for(int i=1; i<=sp; i++){
        //         System.out.print("  ");
        //     }
        //     for(int i=1; i<=st; i++){
        //         System.out.print("* ");
        //     }
        //     if(no_of_line < n){
        //         sp--;
        //         st = st + 2;
        //     }
        //     else {
        //         sp++;
        //         st = st - 2;
        //     }
        //     System.out.println();   
        // }


        // NUMBER PYRAMID pattern


        int st = 1;
        int sp = n-1;
        int no_of_line = 1;

        while(no_of_line <=n){
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            for(int i=1; i<=st; i++){
                System.out.print(no_of_line+ "   ");
            }
            System.out.println();
            st++;
            sp--;
            no_of_line++;
        }



        // PALINDROMIC Pattern with Numbers pattern
        // int number_of_line = 1;
        // int sp = n - 1;
        // int st = 1;
        // // pallindromic pattern with numbers 
        // while(number_of_line<=n){
        //     // print spaces
        //     for(int i=1; i<=sp; i++){
        //         System.out.print("  ");
        //     }
        //     // print stars -> replace with numbers 
        //     int current_num = number_of_line;
        //     for(int i=1; i<=st; i++){
        //         System.out.print(current_num+" ");
        //         if(i <= st/2){
        //             current_num--;
        //         } else {
        //             current_num++;
        //         }
        //     }
        //     // next line
        //     System.out.println();
        //     sp--;
        //     st=st+2;
        //     number_of_line++;
        // }

        



        sc.close();
    }
}