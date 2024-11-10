package tp4_3;

public class Collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteRonde(1926, 8.4);
        us[1] = new Cuillere(1881, 7.3);
        us[2] = new AssietteCarree(1935, 5.6);
        us[3] = new Cuillere(1917, 8.8);
        us[4] = new AssietteRonde(1837, 5.4);

        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
        afficheall(us);
        AssietteRonde asr = new AssietteRonde(1926, 8.4);
        AssietteCarree asc= new AssietteCarree(1935, 5.6);
        System.out.println("L'ustensile recherché a été trouvé : " + Recherche(asc, us)); 
        System.out.println("L'ustensile recherché a été trouvé : " + Recherche(asr, us)); 
    }

    static void afficheall(Ustensile[] us) {
        for (int i = 0; i < us.length; i++) {
            System.out.println(us[i]);
        }
    }

    static void afficherCuilleres(Ustensile[] us) {
        int s = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Cuillere) {
                s++;
            }
        }
        System.out.println(s);
    }

    static void afficherSurfaceAssiettes(Ustensile[] us) {
        double s = 0;
        for (int i = 0; i < us.length; i++) {
            if (us[i] instanceof Assiette) {
                s += ((Assiette) us[i]).calculersurface();
            }
        }
        System.out.println(s);
    }

    static void afficherValeurTotale(Ustensile[] us) {
        double s = 0;
        for (int i = 0; i < us.length; i++) {
            s += us[i].valeur();
        }
        System.out.println(s);
    }

    static boolean Recherche(Ustensile u, Ustensile[] us) {
        for (int i = 0; i < us.length; i++) {
            if (us[i].equals(u)) {
                return true;
            }
        }
        return false;
    }
}



	
	


