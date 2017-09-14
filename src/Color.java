// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

public enum Color {
	ROSEGOLD("Rose Gold"),
	GOLD("Gold"),
	SPACEGRAY("Space Gray"),
	SILVER("Silver");
	
	private String description;
	
	private Color(String descriptor) {
		description = descriptor;
	}
	public String getDescription() {
		return description;
	}
}
