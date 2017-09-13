
public abstract class AbstractPhone extends CartObject implements Phone{
	protected Color color;
	protected PhoneMemory memory;
	
	public AbstractPhone() {
		this.color = Color.Silver;
		this.memory = PhoneMemory.ThirtyTwoGb;
	}
	
	public AbstractPhone(Color color, PhoneMemory memory) {
		this.color = color;
		this.memory = memory;
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public PhoneMemory getMemory() {
		return memory;
	}

	@Override
	public void upgradeMemory(PhoneMemory newMemory) {
		memory = newMemory;
	}

	@Override
	public void changeColor(Color newColor) {
		color = newColor;
	}

}
