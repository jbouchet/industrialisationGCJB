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
	

	public String score() {
		return (JS1 + "-" + JS2);
	}

	public String reset() {
		JS1 = 0;
		JS2 = 0;
		return "0-0";
	}

	public String pointJ1() {
		String result = null;
		
		if (JS1 == 0) {
			JS1 += 15;
			result = "15";
		} else if (JS1 == 15) {
			JS1 = 30;
			result = "30";
		} else if (JS1 == 30) {
			JS1 += 10;
			result = "40";
		} else {
			if (JS2 != 40) {
				reset();
				result = "Victoire du Joueur 1 !";
				
			} else {
				JS1 = 40;
				JS2 = 40;
				result = "Egalité !";
			}
		}
		return result;
	}
}
