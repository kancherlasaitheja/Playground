import java.util.Scanner;
class Main{
	public static void main (String[] args){
         Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>5)
      {System.out.println("******");
        System.out.println("*    *");
      System.out.println("*    *");
      System.out.println("*    *");
      System.out.println("*    *");
      System.out.println("******");
      }
      else if(n<=5)
      {
        System.out.println("*****");
        System.out.println("*   *");
         System.out.println("*   *"); 
        System.out.println("*   *");
        System.out.println("*****");
      }
      
      
    }
}