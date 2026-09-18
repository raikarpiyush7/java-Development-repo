package dataTypeCode;

import java.util.Scanner;

public class radCir {
    public static void main(String[]args){
         Scanner s=new Scanner(System.in);

         int r=s.nextInt();

         double area=3.142*r*r;
         System.out.println("Area of circle is :"+area);
         s.close();
    }
}
