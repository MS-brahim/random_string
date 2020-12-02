package libraryJavaAPp;

public class Employee extends Person {
	private int salary;
	private String specialty;

	public Employee(int id, String fullName, String email, String phone, String birthday, int salary, String specialty) {
		super(id, fullName, email, phone, birthday);
		this.salary = salary;
		this.specialty = specialty;
	}

	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + getId() + ", Full Name="
				+ getFullName() + ", Email=" + getEmail() + ", Phone=" + getPhone() + ", Birthday="
				+ getBirthday() + ", Salary=" + salary + ", specialty=" + specialty + "]";
	}


	
}
