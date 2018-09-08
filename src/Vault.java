import java.util.Random;

public class Vault {
	int code;

	Vault(int code) {
		this.code = code;
	}

	Random r = new Random();

	// int code = r.nextInt(1000000);
	boolean open;

	public static void main(String[] args) {
		// Vault vault = new Vault();
	}

	public void tryCode(int guess) {
		if (guess == code) {
			open = true;
			System.out.println("Vault is open. The code was: " + code + ".");
		} else {
			open = false;
		}
	}

}
