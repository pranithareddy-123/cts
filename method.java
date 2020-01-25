class StaticMethodExample
{
static int num;
int c;
static void setstatic(int a)
{
num=a;
System.out.println(num);
}
void setNonstatic()
{
System.out.println(num);
}
public static void main(String args[])
{
setstatic(10);
StaticMethodExample e=new StaticMethodExample();
e.setstatic(10);
}

}
