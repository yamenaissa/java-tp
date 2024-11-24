package ex2;

public class WrongPwdException extends Exception {
	public String alert() {
		return "wrong password !!";
	}
}
