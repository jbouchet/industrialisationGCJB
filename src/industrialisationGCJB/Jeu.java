package industrialisationGCJB;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Jeu implements Serializable{

	private int JS1;
	private int JS2;
	private transient Serialiser serialiser;
	
	public Jeu(Serialiser serialiser) {
		super();
		this.serialiser = serialiser;
	}

	public Serialiser getSeri() {
		return serialiser;
	}

	public void setSeri(Serialiser serialiser) {
		this.serialiser = serialiser;
	}
	
	public int getJS1() {
		return JS1;
	}
	
	public int getJS2() {
		return JS2;
	}
	
	public void setJS1(int jS1) {
		JS1 = jS1;
	}
	
	public void setJS2(int jS2) {
		JS2 = jS2;
	}
	
	public String init() {
		return "0-0";
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
	
	 public void save() {
	    	serialiser.persist(this);
		}

		public void load() {
	    	Jeu loadedGame = serialiser.read();
	    	this.setJS1(loadedGame.getJS1());
	    	this.setJS2(loadedGame.getJS2());
		}
}
