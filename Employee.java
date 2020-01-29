

public class Employee {
int empid,empsalary;
public Employee(int empid, int empsalary, String empname, String emplocation) {
	super();
	this.empid = empid;
	this.empsalary = empsalary;
	this.empname = empname;
	this.emplocation = emplocation;
}


String empname,emplocation;


public int getEmpid() {
	return empid;
}


public void setEmpid(int empid) {
	this.empid = empid;
}


public int getEmpsalary() {
	return empsalary;
}


public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}


public String getEmpname() {
	return empname;
}


public void setEmpname(String empname) {
	this.empname = empname;
}


public String getEmplocation() {
	return emplocation;
}


public void setEmplocation(String emplocation) {
	this.emplocation = emplocation;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Employee e=new Employee(3, 590,"pranitha","hyd");
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpsalary());
		System.out.println(e.getEmplocation());
*/
	}
}
