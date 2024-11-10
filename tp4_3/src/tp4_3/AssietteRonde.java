package tp4_3;

import java.time.Year;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public String toString() {
        return super.toString() + " assiette_rond [rayon=" + rayon + "]";
    }

    @Override
    public double calculersurface() {
        return 3.14 * rayon * rayon;
    }

    @Override
    public double valeur() {
        int year = Year.now().getValue();
        if (year - annee > 50) {
            return (year - annee - 50) * 1;
        } else {
            return 0;
        }
    }

   
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
      
        AssietteRonde asr = (AssietteRonde) obj;
        return this.rayon == asr.rayon;
    }
}



