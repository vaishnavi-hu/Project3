import java.util.*;
class Naturealnumber2
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i, n,product=1;
System.out.println("Enter the value of n");
n=sc.nextInt();
for(i=1;i<=n;i++)
product=product*i;
System.out.println(n+"product is a natureal number");
System.out.println(n+"product is not a natureal number");
}
}

