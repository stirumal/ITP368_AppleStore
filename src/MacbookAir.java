// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

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
