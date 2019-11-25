import java.util.Scanner;
class Main {
	public static void main (String[] args){
	      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>10000)
      {
      int first=n/10000;
      int second=n%10;
      int sum=first+second;
          System.out.println(sum);
            
      }
      else if(n<10000)
      {
      int t=n/1000;
      int f=n%10;
             int sum1=f+t;
          System.out.println(sum1);
 
      }
      
     
	}
}