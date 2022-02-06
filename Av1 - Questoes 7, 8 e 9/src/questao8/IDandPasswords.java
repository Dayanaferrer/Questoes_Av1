package questao8;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String , String> logininfo = new HashMap <String, String>();
	
	IDandPasswords() {
		
		logininfo.put ("Day","cerveja");
		logininfo.put ("admin","ADMIN");
		logininfo.put ("Charmander","fogo");
	}

	public HashMap getLogininfo() {
		return logininfo;
	}
	
}
