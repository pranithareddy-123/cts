class Factorial
{

public static void main(String args[])
{
Factorial a=new Factorial();
a.factorial(5);
}
void factorial(int n)
{
int i,fact=1;
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}