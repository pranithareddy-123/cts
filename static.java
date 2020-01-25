class A 
{
static int count=0;
int c=4;
A()
{
count++;
}
public static void main(String args[])
{
int b=7;
A a1=new A();
A a2=new A();
System.out.println(count);
A a3=new A();
System.out.println(b);
System.out.println(a3.c);
}
}
