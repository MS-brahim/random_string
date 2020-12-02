/**
 * 
 */
package libraryJavaAPp;


public class Student extends Person{
	
	public Student(int id, String fullName, String email, String phone, String birthday) {
		super(id,fullName,email,phone,birthday);
		
	}

	@Override
	public String toString() {
		return "Student [Id=" + getId() + ", Full name=" + getFullName() + ", Email=" + getEmail()
				+ ", Phone=" + getPhone() + ", Birthday=" + getBirthday() +"]";
	}
}
