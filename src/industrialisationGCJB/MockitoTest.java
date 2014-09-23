package industrialisationGCJB;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoTest {

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		Serialiser serialiser = Mockito.mock(Serialiser.class);
		Jeu jeu = new Jeu(serialiser);
		serialiser.read();
		assertEquals("0-0", jeu.score());
		System.out.println("Score avant de jouer : " + jeu.score());
		System.out.println("J1 - Avant de jouer : " + jeu.getJS1());
		assertEquals("0", jeu.getJS1());
		jeu.pointJ1();
		System.out.println("J1 - Après avoir joué : " + jeu.getJS1());
		assertEquals("15", jeu.getJS1());
		System.out.println("Score après avoir joué : " + jeu.score());
		assertEquals("15-0", jeu.score());
		jeu.score();
		serialiser.persist(jeu);
	}	
}
