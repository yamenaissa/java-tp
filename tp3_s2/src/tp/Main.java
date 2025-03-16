package tp;

import java.util.Collection;

public class Main {
	public static void main(String[] args) {
		DossierPharmacie pharmacie = new DossierPharmacie("Pharmacie Centrale");

		pharmacie.nouveauPatient("Alice", new String[] { "Aspirin", "Vitamin C" });
		pharmacie.nouveauPatient("Bob", new String[] { "Painkiller" });
		pharmacie.nouveauPatient("Charlie", new String[] {});
		pharmacie.nouveauPatient("David", new String[] { "Aspirin", "Antibiotic" });

		System.out.println("--- Initial Patients ---");
		pharmacie.affiche();

		pharmacie.ajoutMedicament("Bob", "Multivitamin");

		System.out.println("\n--- Bob's Information ---");
		pharmacie.affichePatient("Bob");

		System.out.println("\n--- Patients with Aspirin ---");
		Collection<Patient> aspirinPatients = pharmacie.PatientAvecMedicament("Aspirin");
		for (Patient patient : aspirinPatients) {
			patient.affiche();
			System.out.println("--------------------");
		}

		pharmacie.enleverPatientOrdonnanceVide();

		System.out.println("\n--- Patients after removing empty ordonnances ---");
		pharmacie.affiche();

		pharmacie.affichePatient("Alice");
		pharmacie.getPatients().get("alice").trieOrdonnance();
		pharmacie.affichePatient("Alice");
	}
}
