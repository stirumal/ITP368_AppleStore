
public interface Phone {
	
	public Color getColor();
	public PhoneMemory getMemory();
	public void upgradeMemory(PhoneMemory newMemory);
	public void changeColor(Color newColor);
}
