package questao8;

public class Main {

	public static void main(String[] args) {
		
		
		IDandPasswords idandPasswords = new IDandPasswords();
					
		LoginDoSistema loginSistema = new LoginDoSistema(idandPasswords.getLogininfo());		
		
		
}
}