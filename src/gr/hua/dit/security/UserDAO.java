package gr.hua.dit.security;

import gr.hua.dit.entities.User;

public interface UserDAO {
	User findByUserName(String username);
	
	void saveAdmin(User user);
}
