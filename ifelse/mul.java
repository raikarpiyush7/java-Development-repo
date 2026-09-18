package ifelse;

import java.util.Scanner;

public class mul {
    public static void main(String[]args){
          Scanner scan=new Scanner(System.in);
          int n=scan.nextInt();

          if(n%5==0 || n%3==0)
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
