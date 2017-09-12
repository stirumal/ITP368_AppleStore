
public abstract class AbstractPhone implements Phone{
	protected Color color;
	protected Memory memory;
	
	public AbstractPhone() {
		this.color = Color.Silver;
		this.memory = Memory.ThirtyTwoGb;
	}
	
	public AbstractPhone(Color color, Memory memory) {
		this.color = color;
		this.memory = memory;
	}
	
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public Memory getMemory() {
		return memory;
	}

	@Override
	public void upgradeMemory(Memory newMemory) {
		memory = newMemory;
	}

	@Override
	public void changeColor(Color newColor) {
		color = newColor;
	}
	
	public abstract double getPrice();

}
