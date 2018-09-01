import java.util.Random;

public class Vault {
	Random r = new Random();
	
	int code = ;
	boolean open;
public static void main(String[] args) {
	Vault vault = new Vault();
}
public void tryCode(int guess) {
	if(guess == code) {
		open = true;
	}else {
		open = false;
	}
}
}
