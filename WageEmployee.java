
public class WageEmployee extends Employee {
int numbers,hours;




public WageEmployee(int empid, int empsalary, String empname, String emplocation, int numbers, int hours) {
	super(empid, empsalary, empname, emplocation);
	this.numbers = numbers;
	this.hours = hours;
}


@Override
public String toString() {
	return "WageEmployee [numbers=" + numbers + ", hours=" + hours + ", empid=" + empid + ", empsalary=" + empsalary
			+ ", empname=" + empname + ", emplocation=" + emplocation + "]";
}


public int getNumbers() {
	return numbers;
}

public void setNumbers(int numbers) {
	this.numbers = numbers;
}

public int getHours() {
	return hours;
}

public void setHours(int hours) {
	this.hours = hours;
}
 int salary()
{
	return empsalary*hours*numbers;
}

}
