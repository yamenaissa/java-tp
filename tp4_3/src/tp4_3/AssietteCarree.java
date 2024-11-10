package tp4_3;

import java.time.Year;

public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public String toString() {
        return super.toString() + " AssietteCarree [cote=" + cote + "]";
    }

    @Override
    public double calculersurface() {
        return cote * cote;
    }

    @Override
    public double valeur() {
        int year = Year.now().getValue();
        if (year - annee > 50) {
            return (year - annee - 50) * 2;
        } else {
            return 0;
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false; }
        AssietteCarree asc= (AssietteCarree) obj;
        return this.cote == asc.cote;
    }
}



