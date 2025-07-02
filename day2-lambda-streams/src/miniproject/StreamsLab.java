package miniproject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsLab {

	public static void main(String[] args) {
		Student student1=new Student("Karan", 20, new Address("500059"),
				Arrays.asList(new MobileNumber("12345"),new MobileNumber("34567")));
	
	Student student2=new Student("Pavan", 25, new Address("500019"),
			Arrays.asList(new MobileNumber("22345"),new MobileNumber("33567")));
	
	Student student3=new Student("Navin", 26, new Address("500050"),
			Arrays.asList(new MobileNumber("42345"),new MobileNumber("22345")));
	
	Student student4=new Student("Pavan", 23, new Address("500020"),
			Arrays.asList(new MobileNumber("52345"),new MobileNumber("53567")));
	
	List<Student> studentList=Arrays.asList(student1, student2,student3,student4);
	
	//Get the 1st student with name which exactly matches "Pavan", if not found print 'Not Found'
	Optional<Student> st=studentList.stream().filter(s->s.getName().equals("Pavan")).findFirst();
	System.out.println(st.isPresent()?st.get().getName():"Not Found");
	
	//List the student with address matching 500019
studentList.stream().filter(s->s.getAddress().getZipcode().equals("500019")).forEach(System.out::println);

	
	//List all the students having mobile no 22345

	studentList.stream().filter(student->student.getMobileNumbers().stream().anyMatch(n->n.getNumber().equals("22345"))).forEach(s->System.out.println(s.getName()));
	
	//Create a List of TempStudent from the list of Students
	List<TempStudent> ts= studentList.stream().map(s->new TempStudent(s.getName(), s.getAge(), s.getAddress(), s.getMobileNumbers())).collect(Collectors.toList());
	
	}

}
