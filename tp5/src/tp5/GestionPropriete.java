package tp5;

public interface GestionPropriete {
	int MAX_PROPRIETES = 100;

	void afficherProprietes();

	boolean ajouter(Propriété p);

	boolean supprimer(Propriété p);
}
