import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
      int a=num*num;
    return a;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sq=square(n);
      System.out.println(square(n));
	} 
}