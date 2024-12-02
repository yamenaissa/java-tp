package examenTP;

public class CritereMarque implements Critere {
	private String marque;

	public CritereMarque(String marque) {
		this.marque = marque;
	}

	@Override
	public boolean correspond(Object o) {
		return false;
	}

}
