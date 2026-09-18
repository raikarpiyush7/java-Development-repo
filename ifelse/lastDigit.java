package ifelse;

import java.util.Scanner;

public class lastDigit {
     public static void main(String[]args){
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();

          int num=n%1000;
          System.out.println(num);
          scan.close();
}
}

