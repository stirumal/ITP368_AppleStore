// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

public interface Phone {
	
	public Color getColor();
	public PhoneMemory getMemory();
	public void upgradeMemory(PhoneMemory newMemory);
	public void changeColor(Color newColor);
}
