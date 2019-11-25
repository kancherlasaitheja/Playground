import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int first=num%10;
    int second=(num/10)%10;
    int third=num/100;
    int rev=(first*100)+(second*10)+third;
    System.out.println(rev);
  }
}