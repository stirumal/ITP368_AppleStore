// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

public enum LaptopMemory {
	ONETWOEIGHT("128gb", 1), TWOFIVESIX("256gb", 1.2), FIVEONETWO("512gb", 1.4),
	ONETB("1tb", 1.6);
	
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
