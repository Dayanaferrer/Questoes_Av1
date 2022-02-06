package questao8;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String , String> login = new HashMap <String, String>();
	
	IDandPasswords() {
		
		login.put ("Day", "cerveja");
		login.put ("admin", "ADMIN");
		login.put ("Charmander", "fogo");
	}
	
	protected HashMap getLogin(){
		return login;
	}

}
