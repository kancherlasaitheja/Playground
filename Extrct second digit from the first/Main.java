import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>100)
      {
      int first=(n/1000)%10;
      System.out.println(first);
      }
      else if(n<100)
      {
        int f=(n%10);
        System.out.println(f);
      }
	}
}