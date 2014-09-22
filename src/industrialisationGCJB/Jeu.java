package industrialisationGCJB;

public class Jeu {

	private int JS1 = 0;
	private int JS2 = 0;

	public int getJS1() {
		return JS1;
	}
	
	public int getJS2() {
		return JS2;
	}
	
	public void score() {
		System.out.println("" + JS1 + " - " + JS2 + "");
	}

	public void reset() {
		JS1 = 0;
		JS2 = 0;
	}

	public void pointJ1() {
		if (JS1 == 0 || JS1 == 15) {
			JS1 += 15;
		} else if (JS1 == 30) {
			JS1 += 10;
		} else {
			if (JS2 != 40) {
				System.out.println("Victoire du Joueur 1 !");
				reset();
			} else {
				System.out.println("Egalité !");
				JS1 = 40;
				JS2 = 40;
			}
		}
	}
}
