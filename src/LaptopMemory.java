
public enum LaptopMemory {
	OneTweightyEightGb("128gb", 1), TwoFiftySixGb("256gb", 1.2), FiveHundredTwelveGb("512gb", 1.4),
	OneTb("1tb", 1.6);
	
	private LaptopMemory(String description, double multiplier) {
		this.description = description;
		this.multiplier = multiplier;
	}
	
	public String getDescription() {
		return description;
	}
	public double getMultiplier() {
		return multiplier;
	}

	private String description;
	private double multiplier;
}
