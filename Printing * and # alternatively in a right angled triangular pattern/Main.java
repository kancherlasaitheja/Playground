import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n=in.nextInt();
   if(n>=6)
   {
        System.out.println("*\n#*\n#*#\n*#*#\n*#*#*\n#*#*#*");
   }
     else if(n<=5)
     {
        System.out.println("*\n#*\n#*#\n*#*#\n*#*#*"); 
       
     }
     
    }
}