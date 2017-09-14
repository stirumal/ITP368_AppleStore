// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

public class IphoneSix extends AbstractPhone {
	
	private final double BASE_PRICE = 500;
	
	public IphoneSix(Color color, PhoneMemory memory) {
		super(color, memory);
	}

	@Override
	public double getPrice() {
		return BASE_PRICE * memory.getPriceMultiplier();
	}

}
