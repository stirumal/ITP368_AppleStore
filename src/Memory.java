
public enum Memory {
	ThirtyTwoGb("32gb", 1), SixtyFourGb("64gb", 1.2), OneTwoEightGb("128gb", 1.4);
	
	private String description;
	private double priceMultiplier;
	
	private Memory(String descriptor, double multiplier) {
		description = descriptor;
		priceMultiplier = multiplier;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPriceMultiplier() {
		return priceMultiplier;
	}
}
