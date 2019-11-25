import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int input=sc.nextInt();
      int n1=input%10;
      int n3=input/100;
      int sum=n1+n3;
      System.out.println(sum);
      
	}
}