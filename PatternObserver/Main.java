public class Main {
	
	public static void main(String[] args) {
		
		Eleve eleve = new Eleve();
		
		new notesObserver(eleve);
		
		eleve.ajouterNote(15.0f);
		System.out.println(eleve.getMoyenne());
		eleve.ajouterNote(5.0f);
		System.out.println(eleve.getMoyenne());
		eleve.ajouterNote(13.0f);
		System.out.println(eleve.getMoyenne());
		
	}
	
}