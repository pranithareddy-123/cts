class Palindrome{
public static void main(String args[])
{
int num=121,rev=0,r,temp;
temp=num;
while(num>0)
{
r=num%10;
rev=(rev*10)+r;
num=num/10;
}
if(rev==num)
System.out.println("palindrome");
else
System.out.println("not palindrome");


if(num%2==0)
{
System.out.println("not prime");
}
else
System.out.println("prime");
}
}
