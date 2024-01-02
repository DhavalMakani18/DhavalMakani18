import java.util.*;

public class questions_1 {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);

        /*Qustion 1 => Inaprogram,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
         */

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        
        float avg = (a + b + c)/3;
        System.out.println(avg);

       

        /*Question 2  Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.
            formula Area = a * a
        */

            float side = sc.nextFloat();
            float area = side * side;
            System.out.println(area);
        
        
        /* Qustion 3  Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You have to output the total cost of the items back to the user as their bill.
        */
         
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser ;
        System.out.println(total);
        
        float gst = total + (total * 0.18f);
        System.out.println(gst);
        
        
    }
}
