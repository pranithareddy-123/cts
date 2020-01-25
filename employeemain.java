class Employee
{
int empid;
String empname;
int empsalary;
public Employee()
{
int empid=1;
String empname="0";
int empsalary=1;
}
public Employee(int empid,String empname,int empsalary)
{
empid=empid;
empname=empname;
empsalary=empsalary;
}
/*void setEmployee(int id,String name,int salary)
{
empid=id;
empname=name;
empsalary=salary;
}*/
void getEmployee()
{
System.out.println(empid+""+empname+""+empsalary);
}
}
class EmployeeMain
{
public static void main(String args[])
{
Employee e =new Employee(1,'pranitha',1567);
e.getEmployee();
}
}
