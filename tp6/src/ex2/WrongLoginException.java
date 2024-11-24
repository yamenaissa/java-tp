package ex2;

public class WrongLoginException extends Exception {
	public String alert() {
		return "wrong login !!";
	}
}
