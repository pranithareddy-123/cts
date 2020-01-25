class Student
{
int id;
String name,branch;
double fees;
public void getdetails()
{
System.out.println("id"+id+"name"+name+"branch"+branch+"fees"+fees);
}
public void setdetails(int id,String branch,String name,double fees)
{
this.id=id;
this.name=name;
this.branch=branch;
this.fees=fees;
}
public static void main(String args[])
{
Student s=new Student();
s.setdetails(6,"c","jh",76);
s.getdetails();
}
}





