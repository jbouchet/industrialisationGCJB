package industrialisationGCJB;

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
		System.out.println(jeu.pointJ1());
		jeu.pointJ1();
		System.out.println(jeu.score());
		jeu.score();
		serialiser.persist(jeu);
	}	
}
