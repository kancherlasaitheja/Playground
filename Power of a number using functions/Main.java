import java.util.Scanner;
class Main{

  public static int power(int b,int e)
  {
    
    int result=1;
    while(e!=0)
    {
      result=result*b;
      e--;
    }
    return result;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int n1=in.nextInt();
    int powe=power(n,n1);
    System.out.println(power(n,n1));
  }
}
      