package tp2;

public class Point {
    int abs;
    int ord;
    char nom;
    public Point(int a,int o,char n)
    {
        abs=a;
        ord=o;
        nom=n;
    }
    public Point()
    {
        nom='O';
    }
    public Point(Point p)
    {
        abs=p.abs;
        ord=p.ord;
        nom=p.nom;
    }
    void afficher()
    {
        System.out.println(nom + "("+abs+","+ord+")");
    }
    @Override
    public String toString()
    {
        return nom + "("+abs+","+ord+")";
    }
    void deplacer(int a, int b)
    {
        abs += a;
        ord += b;
    }
    public boolean coincide_v1(Point p)
    {
        return (abs==p.abs) && (ord==p.ord) && (nom==p.nom);
    }
    public static boolean coincide_v2(Point p1,Point p2)
    {
        return (p1.abs==p2.abs) && (p1.ord==p2.ord) && (p1.nom==p2.nom);
    }
    void reset() 
    {
        abs = 0;
        ord = 0;
    }
}