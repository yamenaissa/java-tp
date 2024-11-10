package tp4_3;

public class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int annee, double longueur) {
        super(annee);
        this.longueur = longueur;
    }

    @Override
    public String toString() {
        return super.toString() + " Cuillere [longueur=" + longueur + "]";
    }

    @Override
    public double valeur() {
        return (2024 - annee) * 0.5;
    }
}

