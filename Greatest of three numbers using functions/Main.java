import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
     int b=in.nextInt();
     int c=in.nextInt();
    great(a,b,c);
  }
  public static void great(int a,int b,int c)
  {
    if(a>b&&a>c)
      System.out.print(a);
    else if(b>a&&b>c)
      System.out.println(b);
    else
      System.out.println(c);
  }
}
    
     
 
