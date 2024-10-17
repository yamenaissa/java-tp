package tp2;

public class Test {
    public static void main(String[] args) 
    {
        Point p1=new Point(3,5,'A');
        System.out.println(p1);
        p1.afficher();
        p1.deplacer(2,3);
        p1.toString();
        Point p2=new Point(1,4,'b');
        p2.afficher();
        Point p3=new Point();
        p3.afficher();
        Point p4=new Point(p1);
        p4.afficher();
        System.out.println(p1.coincide_v1(p3));
        System.out.println(Point.coincide_v2(p1,p3));
        
        Cercle c1 = new Cercle(p1, 10);
        Cercle c2 = new Cercle(p2, 12.5);
        c1.affiche();
        c2.affiche();
        System.out.println("Les cercles c1 et c2 coïncident : " + c1.coincide(c2));
        System.out.println("Surface de c1 : " + c1.surface());
    }
}