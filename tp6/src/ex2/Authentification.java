package ex2;

import java.io.IOException;
import java.util.Scanner;

public class Authentification {
	private final String loginCorrect = "scott";
	private final String PwdCorrect = "tigre";

	public Authentification() throws WrongPwdException, WrongLoginException, WrongInputLength, IOException {
		getUserlogin();
		getUserPwd();
	}

	public String getUserlogin() throws WrongLoginException, WrongInputLength, java.io.IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Login: ");
		String login = sc.nextLine();
		if (login.length() > 10) {
			throw new WrongInputLength();
		}
		if (!login.equals(loginCorrect)) {
			throw new WrongLoginException();
		}
		return login;
	}

	public String getUserPwd() throws WrongPwdException, WrongInputLength, java.io.IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Password: ");
		String pwd = sc.nextLine();
		if (pwd.length() > 10) {
			throw new WrongInputLength();
		}
		if (!pwd.equals(PwdCorrect)) {
			throw new WrongPwdException();
		}
		return pwd;
	}

}
