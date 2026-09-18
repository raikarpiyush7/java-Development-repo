package ifelse;

import java.util.Scanner;

public class simpleIf {
    public static void main(String[]args){
      Scanner sacn= new Scanner(System.in);

      int age=sacn.nextInt();

      if(age>18)// executes if this true
      {
        System.out.println("eligible to vote");
      }
      else// excutes this if the (if condition is false that is 16>18 in this case ans is false)
      {
         System.out.println("Not eligible to vote");
      }
      sacn.close();
    }
}
