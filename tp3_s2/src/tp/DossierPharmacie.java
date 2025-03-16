package tp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DossierPharmacie {
	private String nom;
	private HashMap<String, Patient> patients;

	public DossierPharmacie(String nom) {
		this.nom = nom;
		patients = new HashMap<String, Patient>();
	}

	public void nouveauPatient(String nom, String[] ord) {
		if (!patients.containsKey(nom.toLowerCase())) {
			Patient nouveauP = new Patient(nom);
			for (String med : ord) {
				nouveauP.ajoutMedicament(med);
			}
			patients.put(nom.toLowerCase(), nouveauP);
		}
	}

	public boolean ajoutMedicament(String nom, String m) {
		if (patients.containsKey(nom.toLowerCase())) {
			patients.get(nom.toLowerCase()).ajoutMedicament(m);
			return true;
		}
		return false;
	}

	public void affichePatient(String nom) {
		if (patients.containsKey(nom.toLowerCase())) {
			patients.get(nom.toLowerCase()).affiche();
		} else {
			System.out.println("Patient: " + nom + "was not found in the 'dossier'");
		}
	}

	public void affiche() {
		System.out.println("Le nom de la pharmacie : " + this.nom);
		System.out.println("Les patients du dossier : \n");
		Set<String> pkey = patients.keySet();
		for (String k : pkey) {
			patients.get(k).affiche();
			System.out.println("--------------------");
		}
	}

	public Collection<Patient> PatientAvecMedicament(String m) {
		Collection<Patient> l = new ArrayList<>();
		Collection<Patient> lp = patients.values();
		Iterator<Patient> it = lp.iterator();
		while (it.hasNext()) {
			Patient p = it.next();
			if (p.contientMedicament(m)) {
				l.add(p);
			}
		}
		return l;
	}

	public void enleverPatientOrdonnanceVide() {
		Iterator<Map.Entry<String, Patient>> iterator = patients.entrySet().iterator();
		while (iterator.hasNext()) { 
			Map.Entry<String, Patient> entry = iterator.next(); 
			Patient patient = entry.getValue(); 
			if (patient.getOrdonnance().isEmpty()) { 
				iterator.remove(); 
			}

		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public HashMap<String, Patient> getPatients() {
		return patients;
	}

	public void setPatients(HashMap<String, Patient> patients) {
		this.patients = patients;
	}
	
	
}
