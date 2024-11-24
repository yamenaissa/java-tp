package ex2;

public class WrongInputLength extends Exception {
	public String alert() {
		return "password is more than 10 characters !!";
	}
}
