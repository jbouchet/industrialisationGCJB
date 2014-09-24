package industrialisationGCJB;

public class Carlos {
	
	public static void main(String[] args) {
		Serialiser serialiser = new Serialiser();
		Jeu jeu = new Jeu(serialiser);
		serialiser.read();
		System.out.println(jeu.pointJ1());
		serialiser.persist(jeu);
		System.out.println(jeu.score());
	}
}
