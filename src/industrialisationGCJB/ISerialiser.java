package industrialisationGCJB;

public interface ISerialiser {
	
	public abstract void persist(Jeu jeu);

	public abstract Jeu read();

}
