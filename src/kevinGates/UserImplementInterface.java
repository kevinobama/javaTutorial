package kevinGates;

import kevinGates.packageExample.User;

public class UserImplementInterface implements UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setEmail("kevinobamatheus@gmail.com");
		user.setName("Kevin gates");
		
		System.out.println("data="+user.data());
	}

//	public void insert() {
//		
//	}
//	
//	public void update() {
//		
//	}
//	
//	public void delete() {
//		
//	}	
}
