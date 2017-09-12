
public class IphoneSeven extends AbstractPhone {
	
	private final double BASE_PRICE = 600;

	@Override
	public double getPrice() {
		return BASE_PRICE * memory.getPriceMultiplier();
	}

}
