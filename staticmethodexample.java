class StaticMethodExample
{
static int num;
int c;
static void setstatic(int a)
{
num=a;
System.out.println(c);
}
public static void main(String args[])
{
setStatic(10);
}
}
