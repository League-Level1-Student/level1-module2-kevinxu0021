
public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String greeting = "";
		if (isKnighted == true && isWoman == true) {
			greeting = "Hello Lady " + name;
		} else if (isKnighted == true && isWoman == false) {
			greeting = "Hello Sir " + name;
		} else if (isKnighted == false && isWoman == false) {
			greeting = "Hello Mr. " + name;
		} else {
			greeting = "Hello Ms. " + name;
		}
		return greeting;

	}

}
