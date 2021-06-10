import java.util.Scanner;
class str3
{
public static void main(String[] args)
{
Scanner scn=new Scanner(System.in);
System.out.println("Enter the string:");
String s=scn.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
{
count++;
}
}
String[] arr=new String[count+1];
String temp="";
int j=0;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!=' ')
{
temp+=s.charAt(i);  
}
else if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
{
arr[j]=temp;
j++;
temp="";
}
}
arr[j]=temp;
temp="";
for(int i=0;i<arr.length;i++)
{
temp+=arr[i]+arr[i].length()+" ";
}
System.out.println(temp);
}
}