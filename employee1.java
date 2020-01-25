class Employee
{
int empid;
String empname;
int empsalary;

void setEmployee(int id,String name,int salary);
{
empid=id;
empname=name;
empsalary=salary;
}
void getEmployee()
{
System.out.println(empid+""+empname+""+empsalary);
}
}
class EmployeeMain
{
public static void main(String args[])
{
Employee e =new Employee();
e.setEmployee(13,"pranitha",50000);
e.getEmployee();
}
}
