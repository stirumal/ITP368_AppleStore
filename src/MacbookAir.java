
public class MacbookAir extends AbstractLaptop {
	
	private final double PRICE = 999;
	
	public MacbookAir() {
		super();
	}
	
	public MacbookAir(Color color, LaptopMemory laptopMemory) {
		this.color = color;
		this.laptopMemory = laptopMemory;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return PRICE;
	}
}
