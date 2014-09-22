package industrialisationGCJB;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestTennis {

	@Test
	public void testInitialisationNouveauJeu() {
		new Jeu();
	}

	@Test 
	public void testAfficherScoreDebutDePartie() {
		Jeu jeu = new Jeu();
		Assert.assertEquals("0-0", jeu.score());
	}
	
	
}
		