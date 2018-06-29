package kevinGates.packageExample.implement;

import kevinGates.packageExample.User;

public class UsersController {

	public static void main(String[] args) {

		User user = new User();
		
		user.setId(100);
		user.setEmail("kevinobamatheus@gmail.com");
		user.setName("Kevin gates");
		
		System.out.println("data="+user.data());
	}
}