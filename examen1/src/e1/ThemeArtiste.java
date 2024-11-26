package e1;

public class ThemeArtiste implements ThemeEvt {
	private String x;

	public ThemeArtiste(String ch) {
		this.x = ch;
	}

	@Override
	public boolean theme(Evenement Evt) {
		if (Evt instanceof Theatre) {
			Theatre t = (Theatre) Evt;
			return t.acteurIn(x) || t.getRealisateur().equals(x) || t.getAuteur().equals(x);
		} else if (Evt instanceof Film) {
			Film f = (Film) Evt;
			return f.acteurIn(x) || f.getRealisateur().equals(x) || f.getProducteur().equals(x);
		} else {
			return false;
		}
	}

}
