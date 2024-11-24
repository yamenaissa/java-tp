package ex2;

import java.io.IOException;

class TestAuthentification {
	public static void main(String[] args)
			throws WrongPwdException, WrongLoginException, WrongInputLength, IOException {
		while (true) {
			try {
				new Authentification();
				break;
			} catch (WrongLoginException | WrongPwdException e) {
				System.out.println(e.getMessage());
			} catch (WrongInputLength | java.io.IOException e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
	}
}
