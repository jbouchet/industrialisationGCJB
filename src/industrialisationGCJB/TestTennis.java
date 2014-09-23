package industrialisationGCJB;


import org.junit.Assert;
import org.junit.Test;

public class TestTennis {

	Jeu jeu = new Jeu();
	
	@Test
	public void testInitialisationNouveauJeu() {
		Jeu jeu = new Jeu();
		Assert.assertEquals("0-0", jeu.init());
	}

	@Test 
	public void testAfficherScoreDebutDePartie() {
		Jeu jeu = new Jeu();
		Assert.assertEquals("0-0", jeu.score());
	}
	
	@Test 
	public void testResetScore() {
		Jeu jeu = new Jeu();
		Assert.assertEquals("0-0", jeu.reset());
	}
	
	@Test 
	public void testPointJ11() {
		if (jeu.getJS1() == 0) {
			Assert.assertEquals("15", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ12() {
		if (jeu.getJS1() == 15) {
			Assert.assertEquals("30", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ13() {
		if (jeu.getJS1() == 30) {	
			Assert.assertEquals("40", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ14() {
		if (jeu.getJS1() == 40) {
			Assert.assertEquals("0", jeu.pointJ1());
		}
	}
	
}
		
