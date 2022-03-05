package javaPractice;
import java.util.Date;
public class inheritance {
	protected String name="tarequl Islam";
	private double salary;
	protected Date DateofBirth;
	
//	public void setSalary(double Salary) {
//		Salary=salary;
//	}
	public void setSalary(double Salary) {
		salary=Salary;
	}
	
	double getsalary() {
		return salary;
	}
	public String getDetails() {
		return name+" "+DateofBirth;
		 
	}
	
	
}
