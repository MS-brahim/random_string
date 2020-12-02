package libraryJavaAPp;
import java.util.Scanner;
import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		ArrayList<Book> bookList = new ArrayList<Book>();
		while (true) {
			Scanner reader = new Scanner(System.in);
			Scanner reader2 = new Scanner(System.in);
			System.out.print("Manage students(s), employees(e), or books(b) ?: ");
			char choice = reader.next().charAt(0);
			
			switch (choice) {
				case 's':
					System.out.print("Create new  student? (y/n) : ");
					char yesOrNo = reader.next().charAt(0);
					switch(yesOrNo) {
						case 'y':
							while(yesOrNo == 'y') {
								System.out.print("Enter id : ");
								int id = reader.nextInt();
								System.out.print("Enter fullname : ");
								String fullName = reader2.nextLine();
								System.out.print("Enter email : ");
								String email = reader2.nextLine();
								System.out.print("Enter phone : ");
								String phone = reader2.nextLine();
								System.out.print("Enter birthday : ");
								String birthday = reader2.nextLine();
								
								Student newStudent = new Student(id,fullName,email,phone,birthday );
					 			studentList.add(newStudent);
					 			System.out.print("Create another student? y/n : ");
					 			yesOrNo = reader.next().charAt(0);
							}
						break;
						case 'n':
						break;
					}
					for(int i=0; i < studentList.size(); i++){
			 		    System.out.println(i+1 +"-"+ studentList.get(i));
			 		}
					if(studentList.size()>=1) {
						System.out.println("Manage students by number : ");
						int nbrItemS = reader.nextInt();
						System.out.println("Do you want to Update/Delete (u/d) ?");
						char UorD = reader.next().charAt(0);
						switch (UorD) {
							case 'u':
								System.out.print("Enter id : ");
								int id = reader.nextInt();
								System.out.print("Enter fullname : ");
								String fullName = reader2.nextLine();
								System.out.print("Enter email : ");
								String email = reader2.nextLine();
								System.out.print("Enter phone : ");
								String phone = reader2.nextLine();
								System.out.print("Enter birthday : ");
								String birthday = reader2.nextLine();
								
								Student updateStudent = new Student(id,fullName,email,phone,birthday);
								studentList.set(nbrItemS-1, updateStudent);
								for(int i=0; i < studentList.size(); i++){
									System.out.println(i+1 +"-"+ studentList.get(i));					    	    
								}
								
					 		break;
							case 'd':
								studentList.remove(nbrItemS-1);
								for(int i=0; i < studentList.size(); i++){
									System.out.println(i+1 +"-"+ studentList.get(i));					    	    
								}		
							break;
						}
					
					}else {
						System.out.println("No student found in this arraylist !!!!!!!");
					}
				case 'e':
					System.out.print("Create new employee ? Yes(y)/No(n) : ");
					char yesOrNo1 = reader.next().charAt(0);
					switch(yesOrNo1) {
						case 'y':
							while(yesOrNo1 == 'y') {
								System.out.print("Enter id : ");
								int id = reader.nextInt();
								System.out.print("Enter fullname : ");
								String fullName = reader2.nextLine();
								System.out.print("Enter email : ");
								String email = reader2.nextLine();
								System.out.print("Enter phone : ");
								String phone = reader2.nextLine();
								System.out.print("Enter birthday : ");
								String birthday = reader2.nextLine();
								System.out.print("Enter salary : ");
								int salary = reader.nextInt();
								System.out.print("Enter specialty : ");
								String specialty = reader2.nextLine();
								
								Employee newEmployee = new Employee(id,fullName,email,phone,birthday,salary,specialty);
								employeeList.add(newEmployee);
					 			System.out.print("Create another employee ? Yes(y)/No(n) : ");
					 			yesOrNo1 = reader.next().charAt(0);
					 			
							}
						break;
						case 'n':
						break;
					}
					for(int i=0; i < employeeList.size(); i++){
			 		    System.out.println(i+1 +"-"+ employeeList.get(i));
			 		}
					System.out.println("Manage employees by number : ");
					int nbrItemE = reader.nextInt();
					System.out.println("Do you want to Update(u) or Delete(d) ?");
					char UorD1 = reader.next().charAt(0);
					switch(UorD1) {
						case 'u':
							System.out.print("Enter id : ");
							int id = reader.nextInt();
							System.out.print("Enter fullname : ");
							String fullName = reader2.nextLine();
							System.out.print("Enter email : ");
							String email = reader2.nextLine();
							System.out.print("Enter phone : ");
							String phone = reader2.nextLine();
							System.out.print("Enter birthday : ");
							String birthday = reader2.nextLine();
							System.out.print("Enter salary : ");
							int salary = reader.nextInt();
							System.out.print("Enter specialty : ");
							String specialty = reader2.nextLine();
									
							Employee updateEmployee = new Employee(id,fullName,email,phone,birthday,salary,specialty);
							employeeList.set(nbrItemE-1, updateEmployee);
							for(int i=0; i < employeeList.size(); i++){
					    	    System.out.println(i+1 +"-"+ employeeList.get(i));
							}
						break;
						case 'd':
							employeeList.remove(nbrItemE-1);
							
							for(int i=0; i < employeeList.size(); i++){
					    	    System.out.println(i+1 +"-"+ employeeList.get(i));
							}
						break;
					}
				case 'b':
					System.out.print("Create new book ? Yes(y)/No(n) : ");
					char yesOrNo2 = reader.next().charAt(0);
					switch(yesOrNo2) {
						case 'y':
							while(yesOrNo2 == 'y') {
								System.out.print("Enter id : ");
								int id = reader.nextInt();
								System.out.print("Enter title : ");
								String title = reader2.nextLine();
								System.out.print("Enter author : ");
								String author = reader2.nextLine();
								
								bookList.add( new Book(id,title,author));
								System.out.print("Create another book ? Yes(y)/No(n) : ");
								yesOrNo2 = reader.next().charAt(0);
								
							}
						case 'n':
						break;
					}
					for(int i=0; i < bookList.size(); i++){
			    	    System.out.println(i+1 +"-"+ bookList.get(i));
					}
					if(bookList.size()>=1) {
						System.out.println("Manage books by number : ");
						int nbrItemB = reader.nextInt();
						System.out.println("Do you want to Update(u) or Delete(d) ?");
						char UorD2 = reader.next().charAt(0);
						switch(UorD2) {
							case 'u':
								System.out.print("Enter id : ");
								int id = reader.nextInt();
								System.out.print("Enter title : ");
								String title = reader2.nextLine();
								System.out.print("Enter author : ");
								String author = reader2.nextLine();
								
								bookList.set(nbrItemB-1, new Book(id,title,author));
								for(int i=0; i < bookList.size(); i++){
						    	    System.out.println(i+1 +"-"+ bookList.get(i));
								}
							break;
							
							case 'd':
								bookList.remove(nbrItemB-1);
								
								for(int i=0; i < bookList.size(); i++){
						    	    System.out.println(i+1 +"-"+ bookList.get(i));
								}
							break;
						}
					}else {
						System.out.println("No books found here ... ");
					}
				}
			reader.close();
			reader2.close();
		}		
	}
}
/*Person PersonObj = new Person();
		Student studObj = new Student();
		
		studObj.setId(1);
		studObj.setFullName("ibra");
		PersonObj.setEmail("hgg@hgh");
		PersonObj.setPhone("878787");
		PersonObj.setBirthday("22/22/2020");
		System.out.println(studObj);*/