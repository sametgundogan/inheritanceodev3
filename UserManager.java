package inheritanceodev;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName() + " adlı kullanıcı " + user.getUserId() + " numarası ile eklendi!");
	
	}
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			add(user);
		}
		
	}
}
