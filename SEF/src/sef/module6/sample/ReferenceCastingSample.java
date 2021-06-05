package sef.module6.sample;

public class ReferenceCastingSample {

	public static void main(String arg[]){
		
		Student_P s = new Student_P();
		s.setName("Jane Doe");
		s.setSchool("A Fictional School");
		s.setGrade(10);
		
		// Sample reference casting
		Person_P tempPerson = s; // convert student to person
		tempPerson.announce();
		Student_P tempStudent = (Student_P)tempPerson; // convert person to student
		tempStudent.announce();
		System.out.println("temp student name:" + tempStudent.getName());
		System.out.println("temp student school" + tempStudent.getSchool());
		tempStudent.setSchool("Fictional master school");
		System.out.println("Fictional master school");
	}
}
