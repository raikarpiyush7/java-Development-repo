package dataTypeCode;

import java.util.Scanner;

public class deciamlvalue {
     public static void main(String[]args){
       Scanner scan=new Scanner(System.in);

       int r=scan.nextInt();

       double area=3.142*r*r;

       System.out.printf("%.5f",area);

       scan.close();
     }

}
