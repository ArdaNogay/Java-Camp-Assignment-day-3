package assignment1;

public class UserManager {

	public void addComment(User user) {
		
		System.out.println("'"+user.getNickname() +"'"+ " takma ad�na sahip "+"-"+user.getFirstName()+" "+user.getLastName()+"-"+" adl� ki�i "+"'"+user.getComment()+"'"+ " yorumu yap�t�!");
	}

}
