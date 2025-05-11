package tp4_1demoJDBC;

import java.sql.Connection;
import java.util.List;

import JDBCPRoject.beans.Client;
import connexion.Connexion;
import service.ClientService;

public class Test {
	public static void main(String[] args) {
		ClientService cservice = new ClientService();
		Connection conn = Connexion.getConnexion();
		Client c1 = new Client(0, "mohamed", "salah");
		Client c2 = new Client(0, "Martin", "Sophie");
		Client c3 = new Client(0, "Durand", "Marie");
		Client c4 = new Client(0, "Petit", "Pierre");
		Client c5 = new Client(0, "Leroy", "Emma");
		cservice.create(c1);
		cservice.create(c2);
		cservice.create(c3);
		cservice.create(c4);
		cservice.create(c5);
		System.out.println("Clients créés avec succès.");

		System.out.println("\n=== Affichage du client avec id = 3 ===");
		Client cId3 = cservice.findById(3);
		if (cId3 != null) {
			System.out.println(cId3);
		} else {
			System.out.println("Aucun client trouvé avec l'id 3.");
		}

		System.out.println("\n=== Suppression du client avec id = 3 ===");
		if (cId3 != null) {
			boolean deleteResult = cservice.delete(cId3);
			if (deleteResult) {
				System.out.println("Client supprimé avec succès.");
			} else {
				System.out.println("Échec de la suppression du client.");
			}
		}

		System.out.println("\n=== Modification du client avec id = 2 ===");
		Client cId2 = cservice.findById(2);
		if (cId2 != null) {
			cId2.setNom("Martin-Dupuis");
			cId2.setPrenom("Sophie-Anne");

			boolean updateResult = cservice.update(cId2);
			if (updateResult) {
				System.out.println("Client modifié avec succès.");
				System.out.println("Nouvelles informations : " + cId2);
			} else {
				System.out.println("Échec de la modification du client.");
			}
		} else {
			System.out.println("Aucun client trouvé avec l'id 2.");
		}
		System.out.println("\n=== Liste de tous les clients ===");
		List<Client> clients = cservice.findAll();
		for (Client c : clients) {
			System.out.println(c);
		}
	}
}