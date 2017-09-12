
public class Macbook extends AbstractLaptop {
	
	private final double PRICE = 1299;
	
	public Macbook() {
		super();
	}
	
	public Macbook(Color color, LaptopMemory laptopMemory) {
		this.color = color;
		this.laptopMemory = laptopMemory;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return PRICE;
	}
}
