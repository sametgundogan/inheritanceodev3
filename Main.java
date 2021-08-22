package inheritanceodev;

public class Main {

	public static void main(String[] args) {

		InstructorUser engin = new InstructorUser();
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setUserId(193000);
		engin.position = "Java";
		engin.instructorNumber = 0001;
		
		StudentUser samet = new StudentUser();
		samet.setFirstName("Samet");
		samet.setLastName("Gündoğan");
		samet.level = "Beginner";
		samet.setUserId(194000);
		
		
		UserManager userManager = new UserManager();
		User [] users = {engin, samet};
		
		userManager.addMultiple(users);
		
		
	}

}
