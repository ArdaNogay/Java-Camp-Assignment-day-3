package assignment1;

public class UserManager {

	public void addComment(User user) {
		
		System.out.println("'"+user.getNickname() +"'"+ " takma adına sahip "+"-"+user.getFirstName()+" "+user.getLastName()+"-"+" adlı kişi "+"'"+user.getComment()+"'"+ " yorumu yapıtı!");
	}

}
