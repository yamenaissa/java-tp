package Exercice1;

import java.util.Comparator;

public class CompareMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return Double.compare(e2.moyenne(), e1.moyenne());
    }
}
