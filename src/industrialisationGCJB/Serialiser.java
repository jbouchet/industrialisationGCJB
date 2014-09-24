package industrialisationGCJB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
		
public class Serialiser implements ISerialiser {
	/* (non-Javadoc)  
	 * @see org.imie.testTDDTennis.ISerialiser#persist(org.imie.testTDDTennis.Jeux)
	 */
	@Override
	public void persist(Jeu jeu)  {
		ObjectOutputStream oos = null;
		FileOutputStream fichier;
		
		try {
			fichier = new FileOutputStream("jeu.ser");
			oos = new ObjectOutputStream(fichier);
			oos.writeObject(jeu);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.imie.testTDDTennis.ISerialiser#read()
	 */
	@Override
	public Jeu read()  {
		ObjectInputStream ois = null;
		FileInputStream fichier;
		Jeu retour;
		
		try {
			fichier = new FileInputStream("jeu.ser");
			ois = new ObjectInputStream(fichier);
			retour = (Jeu) ois.readObject();
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return retour;
	}
}
