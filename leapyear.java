import java.util.Scanner;
class LeapYear{
public static void main(String args[])
{
int year;
Scanner s=new Scanner(System.in);
System.out.println("enter any year");
year=s.nextInt();
if(year % 400==0 || year % 4==0){
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}