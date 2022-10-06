package kodlamaioHW3;

public class Teacher extends User{
	double salary;
	String branch;
	
	
	public Teacher() {
		super();
	}
	public Teacher(double salary, String branch) {
		super();
		this.salary = salary;
		this.branch = branch;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}
