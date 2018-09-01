
public class Minion {
	private String Name;
	private int Eyes;
	private String Color;
	private String Master;
	String master;

	Minion(String Name, int Eyes, String Color, String Master) {
		this.Name = Name;
		this.Eyes = Eyes;
		this.Color = Color;
		this.Master = Master;
	}
public String getName() {
	return Name;
}
public int getEyes() {
	return Eyes;
}
public String getColor() {
	return Color;
}
public String getMaster() {
	return master;
}
public String setMaster(String Master) {
	return master = Master;
}
}
