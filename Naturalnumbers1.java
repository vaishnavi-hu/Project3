import java.util.*;
class Naturalnumbers1
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int i,n,sum=0;
i=1;
System.out.println("Enter the value of n");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
System.out.println(sum+" ");
}
}
}

