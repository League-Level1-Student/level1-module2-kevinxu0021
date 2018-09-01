public class TeaRunner {
public static void main(String[] args) {
	TeaBag Teabag = new TeaBag("Green");
	Teabag.getFlavor();
	Kettle kettle = new Kettle();
	kettle.getWater();
	kettle.boil();
	Cup cup = new Cup();
	cup.makeTea(Teabag, kettle.getWater());
}
}
