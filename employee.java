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
