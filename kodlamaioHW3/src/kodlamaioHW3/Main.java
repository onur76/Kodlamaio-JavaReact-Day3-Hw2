package kodlamaioHW3;

public class Main {

	public static void main(String[] args) {
		
		TeacherManager teacher1 = new TeacherManager();
		teacher1.setId(1);
		teacher1.setName("Engin");
		teacher1.setSurname("Demirog");
		teacher1.setAge(19);
		teacher1.setGender("Male");
		teacher1.setNationalIdentity("1111111111111");
		
		
		
		StudentManager student1 = new StudentManager();
		student1.setId(1);
		student1.setName("Onur");
		student1.setSurname("AKKOYUN");
		student1.setAge(18);
		student1.setGender("Male");
		student1.setNationalIdentity("22222222222222");
		
		
		UserManager userManager = new UserManager();
		userManager.add(new User());
		userManager.add(student1);
		userManager.add(teacher1);

	}

}
