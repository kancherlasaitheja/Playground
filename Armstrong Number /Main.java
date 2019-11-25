import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   int originalNumber, remainder, result = 0;

   Scanner in=new Scanner(System.in);
      int number = in.nextInt();

    originalNumber = number;

    while (originalNumber != 0)
    {
        remainder = originalNumber%10;
        result += remainder*remainder*remainder;
        originalNumber /= 10;
    }

    if(result == number)
       System.out.println("Armstrong Number");
    else
        System.out.println("Not a Armstrong Number");
	}
}