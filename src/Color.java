
public enum Color {
	RoseGold("Rose Gold"),
	Gold("Gold"),
	SpaceGray("Space Gray"),
	Silver("Silver");
	
	private String description;
	
	private Color(String descriptor) {
		description = descriptor;
	}
	public String getDescription() {
		return description;
	}
}
