import java.util.Scanner;
class Calc
{
public static void main(String args[])
{
int n=2,m,t;
Scanner s=new Scanner(System.in);
System.out.println("enter first number");
m=s.nextInt();
System.out.println("enter second number");
t=s.nextInt();

switch(n)
{
 case 1:System.out.println(m+t);
break;
case 2:System.out.println(m-t);
break;
case 3:System.out.println(m*t);
break;
case 4:System.out.println(m/t);
break;
}
}
}

