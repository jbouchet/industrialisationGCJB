package industrialisationGCJB;

public class Test {

	@Test
	public void testInitialisationNouveauJeu() {
		new Jeu();
	}

	@Test 
	public void testAfficherScoreDebutDePartie() {
		Jeu jeu = new Jeu();
		Assert.assertEquals("0-0", jeu.score()) ;
	}
}
