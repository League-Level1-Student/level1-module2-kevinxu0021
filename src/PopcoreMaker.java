import javax.swing.JOptionPane;

public class PopcoreMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor do you want the popcorn to be?");
		String timestring = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
		int time = Integer.parseInt(timestring);
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		microwave.setTime(time);
		microwave.startMicrowave();
	}
}
