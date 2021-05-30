package assignment1;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setGrade("Java Sýnýfý");
		
		
		Student student1=new Student();
		student1.setFirstName("Arda");
		student1.setLastName("Nogay");
		student1.setStudentNumber("295");
		
		
		User user1=new User();
		user1.setFirstName("Bilinmeyen");
		user1.setLastName("Kullanýcý");
		user1.setNickname("Unknown");
		user1.setComment("KURS GÜZEL ÝLERLÝYOR.");
		
		UserManager userManager=new UserManager();
		userManager.addComment(user1);
		
		StudentManager studentManager= new StudentManager();
		studentManager.addAttendance(student1);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInfo(instructor1);
		
		
		
		
		

	}

}
