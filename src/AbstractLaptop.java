
public abstract class AbstractLaptop extends CartObject implements Laptop {
	
	protected Color color;
	protected LaptopMemory laptopMemory;
	
	public AbstractLaptop() {
		this.color = Color.SpaceGray;
		this.laptopMemory = LaptopMemory.OneTweightyEightGb;
	}
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public LaptopMemory getLaptopMemory() {
		// TODO Auto-generated method stub
		return laptopMemory;
	}

	@Override
	public void changeColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public void upgradeLaptopMemory(LaptopMemory laptopMemory) {
		// TODO Auto-generated method stub
		this.laptopMemory = laptopMemory;
	}

}
