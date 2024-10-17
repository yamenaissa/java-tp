package tp2;

public class Cercle {
    Point centre;
    double r;
    public Cercle(Point p1,double r1)
    {
        centre=p1;
        r=r1;
    }
    void affiche()
    {
        System.out.println("le centre : ");
        centre.afficher();
        System.out.println("le rayon : "+r);
    }
    void deplacer(int x,int y)
    {
        centre.deplacer(x,y);
    }
    public boolean coincide(Cercle c)
    {
    	return centre.coincide_v1(c.centre) && this.r==c.r;
    }
    public double surface()
    {
    	return Math.PI * r * r;
    }
    public double perimetre()
    {
        return 2 * Math.PI * r;
    }
}
