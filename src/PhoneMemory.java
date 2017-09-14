// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

public enum PhoneMemory {
	THIRTYTWO("32gb", 1), SIXTYFOUR("64gb", 1.2), ONETWOEIGHT("128gb", 1.4);
	
	private String description;
	private double priceMultiplier;
	
	private PhoneMemory(String descriptor, double multiplier) {
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
