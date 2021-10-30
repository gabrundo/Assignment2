package utente;

abstract class Utente {
	
	//Identità
	protected String username, password;
	
	
	public Utente(String name, String pass) {

	}
	
	/**
	 * Post-condizioni: permette al utente, tramite verifica di username e password,
	 * 					di accedere al sistema.
	 */
	public abstract void accedi();
	
}