package ifelse;

import java.util.Scanner;

public class TwoNum {
    public static void main(String[]args){
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();

         if(n>=100998 && n<=999)
        {
             System.out.println("yes");
        }
        else
        {
             System.out.println("no");
        }
         scan.close();
    }
}
