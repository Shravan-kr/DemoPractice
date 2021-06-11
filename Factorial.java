//Factorial
import java.util.Scanner;
class Factorial
{
public static void main(String[] ar)
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the number");
int n=scn.nextInt();
int res=fact(n);
System.out.println("The factorial is "+res);
}

static int fact(int n)
{
if(n==0) return 1;
return n*fact(n-1);
}
}