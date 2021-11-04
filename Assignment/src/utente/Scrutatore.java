package utente;

public class Scrutatore extends Utente {
	
	private boolean qualifica;

	public Scrutatore(String name, String pass) {
		super(name, pass);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void accedi() {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Post-condizioni: restituisce true se l'elettore E ha diritto di voto, false altrimenti.
	 */
	public boolean verifica(Elettore E) {
		return false;
	}
	
	/**
	 * Altri metodi che dovranno essere implementati:
	 * 	- definire modalità di voto
	 * 	- inserire liste elettorali
	 * ...
	 */

}
