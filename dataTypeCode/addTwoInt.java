package dataTypeCode;

import java.util.Scanner;

public class addTwoInt {
    public static void main(String[]args){
     Scanner d=new Scanner(System.in);

     int a=d.nextInt();
     int b=d.nextInt();

     int sum =a+b;
     System.out.println(sum);
     d.close();
}
}
