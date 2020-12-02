package libraryJavaAPp;
import java.util.ArrayList;

public class Person {
	private int id;
	private String fullName;
	private String email;
	private String phone;
	private String birthday;
	
	//constructor
	public Person(int id, String fullName, String email, String phone, String birthday) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
		this.birthday = birthday;
	} 
	
	
	
	public Person() {
		super();
	}

	//Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	//display data 
	public String ViewPerson(ArrayList<Person> listPerson) {
		try {
			String s="";
			for (Person person : listPerson) {
				s += person.toString();
			} 
			return s;
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
	}
	//create new data 
	public String CreatePerson(ArrayList<Person> listPerson, Person person) {
		try {
			listPerson.add(person);
			return "Person Added";
			
		}catch(Exception ex) {
			return ex.getMessage();
		}
			
	}
	
	//update data 
	public String updatePerson(ArrayList<Person> listPerson, Person person, int index) {
		try {
			listPerson.set(index, person);
			return "Person Edited !";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}
	
	//delete data 
	public String deletePerson(ArrayList<Person> listPerson, int index) {
		try {
			
			listPerson.remove(index);
			return "Person Removed !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
	}

}
