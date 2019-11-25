import java.util.Scanner;
class Main{
  public static int sumofnum(int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
       
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int j=sumofnum(n1);
      System.out.println(sumofnum(n1));
      
	   
	}
}