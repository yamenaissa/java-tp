package service;

import dao.IDao;

import connexion.Connexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import JDBCPRoject.beans.*;

public class ClientService implements IDao<Client> {

	@Override
	public boolean create(Client o) {
		try {
			PreparedStatement ps = Connexion.getConnexion()
					.prepareStatement("INSERT INTO client(nom, prenom) VALUES(?, ?);", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			int c = ps.executeUpdate();
			if (c > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Client> findAll() {
		List<Client> clients = new ArrayList<>();
		String sql = "SELECT * FROM client";

		try (Statement st = Connexion.getConnexion().createStatement();
			ResultSet resSet = st.executeQuery(sql)) {

			while (resSet.next()) {
				Client client = new Client(resSet.getInt("id"), resSet.getString("nom"), resSet.getString("prenom"));
				clients.add(client);
			}
		} catch (SQLException e) {
			System.err.println("Erreur lors de la récupération des clients : " + e.getMessage());
		}

		return clients;
	}

	@Override
	public Client findById(int id) {
		try (PreparedStatement ps = Connexion.getConnexion().prepareStatement("SELECT * FROM client WHERE id = ?")) {
			ps.setInt(1, id);
			try (ResultSet resSet = ps.executeQuery()) {
				if (resSet.next()) {
					return new Client(resSet.getInt("id"), resSet.getString("nom"), resSet.getString("prenom"));
				}
			}
		} catch (SQLException e) {
			System.err.println("Erreur lors de la recherche du client : " + e.getMessage());
		}
		return null;
	}

	@Override
	public boolean delete(Client o) {
		try (PreparedStatement ps = Connexion.getConnexion().prepareStatement("DELETE FROM client WHERE id = ?")) {
			ps.setInt(1, o.getId());
			int nbRows = ps.executeUpdate();
			return nbRows > 0;
		} catch (SQLException e) {
			System.err.println("Erreur lors de la suppression du client : " + e.getMessage());
			return false;
		}
	}

	@Override
	public boolean update(Client o) {
		try (PreparedStatement ps = Connexion.getConnexion().prepareStatement("UPDATE client SET nom = ?, prenom = ? WHERE id = ?")) {
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			ps.setInt(3, o.getId());

			int nbRows = ps.executeUpdate();
			return nbRows > 0;
		} catch (SQLException e) {
			System.err.println("Erreur lors de la mise à jour du client : " + e.getMessage());
			return false;
		}
	}

}
