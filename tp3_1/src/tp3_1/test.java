package tp3_1;

public class test{
	public static void main(String[] args)
	{
		Vehicule v=new Vehicule("Clio","Classique",2000,20.000);
		Vehicule w=new Vehicule("Mercedes","Fantome",2008,60.000);
		Vehicule x=new Vehicule("Kia","Pivanto",2012,35.000);
		//v.decrisVehicule();
		//System.out.println(v.getMarque());
		AgenceMobiliere t=new AgenceMobiliere(5);
		t.ajoutVehicule(v);
		t.ajoutVehicule(x);
		t.ajoutVehicule(w);
		t.affichtab();
		t.selection(2);
		t.selection("Clio");
		t.selection(40.0);
		t.ancienne();
	}
}