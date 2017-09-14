// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

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
