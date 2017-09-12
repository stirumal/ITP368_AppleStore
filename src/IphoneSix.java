
public class IphoneSix extends AbstractPhone {
	
	private final double BASE_PRICE = 500;

	@Override
	public double getPrice() {
		return BASE_PRICE * memory.getPriceMultiplier();
	}

}
