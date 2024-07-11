import java.util.*;
class Electricitybill
{
public static void main(String args[])
{
int sales;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sales rete");
sales=sc.nexstInt();
if(sales>=20000)
{
com=(sales*3)/100f;
}
else if(sales>20000 && sales<=50000)
{
com=(sales*12)/100f;
}
else
}
System.out.println("commission amount:"+com):
System.out.println("rate of commission:"+(com*100)/sales);
}
}


