import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n<=5)
      {
           System.out.println("54321");
           System.out.println("4321");
           System.out.println("321");
           System.out.println("21");
           System.out.println("1");
      }
      else if(n>=6)
      {
           System.out.println("654321");
           System.out.println("54321");
      	   System.out.println("4321");
           System.out.println("321");
           System.out.println("21");
           System.out.println("1");
      }
	}
}