package Springboot_webApp.myWebApp.login;

	import org.springframework.stereotype.Service;

	@Service
	public class AuthenticationService {
		
		public boolean authenticate(String username, String password) {
			
			boolean isValidUserName = username.equalsIgnoreCase("Mansoor");
			boolean isValidPassword = password.equalsIgnoreCase("dummy");
			
			return isValidUserName && isValidPassword;
		}
	}

