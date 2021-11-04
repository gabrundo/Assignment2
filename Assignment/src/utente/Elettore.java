package utente;

public class Elettore extends Utente {
	
	//TODO scheda elettorale
	//TODO carta identità

	public Elettore(String name, String pass) {
		super(name, pass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accedi() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Post-condizioni: restituisce true se i documenti dell'elettore sono validi, false altrimenti. 
	 */
	public boolean documentiValidi() {
		return false;
	}
	
}