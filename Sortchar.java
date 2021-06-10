class Sortchar
{
public static void main(String[] args)
{
char[] ar={'z','x','y','m','a','n','q','o','b'};
for(int i=0;i<ar.length-1;i++)
{
for(int j=i+1;j<ar.length;j++)
{
if(ar[i]>ar[j])
{
char t=ar[i];
ar[i]=ar[j];
ar[j]=t;
}
}
}
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
}
}