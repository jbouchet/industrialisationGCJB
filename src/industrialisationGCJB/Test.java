package industrialisationGCJB;

public class Test {

	@Test
	public void testInitialisationNouveauJeu() {
		Jeu jeu = new Jeu();
	}

	@Test 
	public void testAfficherScoreDebutDePartie() {
		Assert.assertEquals("0-0", jeu.score());
	}
	
	@Test 
	public void testResetScore() {
		Assert.assertEquals("0-0", jeu.reset());
	}
	
	@Test 
	public void testPointJ1() {
		if (jeu.getJS1() == 0) {
			Assert.assertEquals("15", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ1() {
		if (jeu.getJS1() == 15) {
			Assert.assertEquals("30", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ1() {
		if (jeu.getJS1() == 30) {
			Assert.assertEquals("40", jeu.pointJ1());
		}
	}
	
	@Test 
	public void testPointJ1() {
		if (jeu.getJS1() == 40) {
			Assert.assertEquals("0", jeu.pointJ1());
		}
	}
}
