package tp4_3;

public abstract class Ustensile {
    protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Ustensile [annee=" + annee + "]";
    }

    @Override
    public boolean equals(Object obj) {
      
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Ustensile other = (Ustensile) obj;
        return this.annee == other.annee;
    }


    public abstract double valeur();
}


