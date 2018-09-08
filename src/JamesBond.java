public class JamesBond {

	public static void main(String[] args) {
		findCode();

	}

	public static void findCode() {
		Vault vault = new Vault(543456);
		for (int i = 0; i < 1000000; i++) {
			vault.tryCode(i);
		}
	}
}
