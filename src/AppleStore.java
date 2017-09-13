import java.util.Arrays;
import java.util.Scanner;

public class AppleStore {

	// scanner used in various functions
	private Scanner sc;
	// current order of current user
	private StoreOrder currentOrder;
	
	private PizzaMenu menu;

	// constructor
	public AppleStore() {
		sc = new Scanner(System.in);
	
	}
	
	// main function
	public static void main(String[] args){
		AppleStore myShop = new AppleStore();
		System.out.println("Welcome to the pizza shop!");
		myShop.createOrder();
		myShop.askForAction();
		
	}
	
	// asks for username, assigns username value, creates a new order with username
	public void createOrder(){
		currentOrder = new StoreOrder();
	}
	
	
	//TODO: create list of products
	// asks user to select from actions in a menu
	public void askForAction(){
		boolean finished = false;
/*		while (!finished){
			System.out.println(menu.getWholeMenu());
			int choice = InputHelper.readIntBetween("Choose menu option", 1, PizzaMenu.values().length);
			switch(PizzaMenu.values()[choice-1]) {
			case NUM01: 
				createRegularCrustPizza("custom");
				break;
			case NUM02: 
				createStuffedCrustPizza();
				break;
			case NUM03: 
				createRegularCrustPizza("veggie");
				break;
			case NUM04: 
				createRegularCrustPizza("meat");
				break;
			case VIEW:
				System.out.println(currentOrder);
				break;
			case	 CANCEL:
				System.out.println("We're sorry you've decided to cancel your order. Have a good day, and we hope to see you again soon.");
				finished = true;
				break;
			case	 PAY:
				System.out.println(String.format("Your order of %d item(s) costs $%.2f. Thank you for coming, and we hope to see you again soon.", currentOrder.orderSize(), currentOrder.totalCost()));
				finished = true;
				break;

			}
		}*/
	}
	

		
/*	// create and add a regular crust pizza to the order
	//kind is passed from askForAction, so is a trusted, programmed value
	private void createRegularCrustPizza(String kind) {
		Pizza p = RegularCrustPizza.make(askForSize(), askForCrust());
		switch(kind) {
		case "custom": 
			askForToppings(p); 
			break;
		case "veggie": 
			//neat trick to take an array and turn it to a list:
			p.addToppings(Arrays.asList(Pizza.VEGGIE_LIST));
			break;
		case "meat":	
			//neat trick to take an array and turn it to a list:
			p.addToppings(Arrays.asList(Pizza.MEAT_LIST));
			break;
		}
		System.out.println("New pizza added to order: " + p);
		currentOrder.addPizza(p);
	}

	

	private Size askForSize() {
		boolean isValid = false;
		Size size = null;
		while(!isValid) {
			String prompt = ("What size pizza do you want?" + Arrays.toString(Size.values()));
			String input = InputHelper.readString(prompt).toUpperCase();
			try {
				size = Size.valueOf(input);  //can throw an exception if input is not in enum
				isValid = true;
			}
			catch(Exception e) {
				System.out.println(input + " was not recognized as a valid size option");
			}
		}
		
		return size;
	}
	
	private CrustType askForCrust() {
		boolean isValid = false;
		CrustType crust = null;
		while(!isValid) {
			String prompt = ("What type of crust do you want?" + Arrays.toString(CrustType.values()));
			String input = InputHelper.readString(prompt).toUpperCase();
			try {
				crust = CrustType.valueOf(input);  //can throw an exception if input is not in enum
				isValid = true;
			}
			catch(Exception e) {
				System.out.println(input + " was not recognized as a valid crust type");
			}
		}
		
		return crust;
	}

	// create and add a stuffed crust pizza to the order
	//UPDATE this method to use input helper
	public void createStuffedCrustPizza(){
		Size size = askForSize();
		boolean wantPepperoniBoolean = InputHelper.readBoolean("Do you want pepperoni in the crust? Type \"yes\" or \"YES\" if you want pepperoni in the crust"
					+ " \n\tand any other keys if you don't want pepperoni in the crust.");
		StuffedCrustPizza newPizza = new StuffedCrustPizza(size,wantPepperoniBoolean);
		askForToppings(newPizza);
		currentOrder.addPizza(newPizza);
	}
	
	// ask and add toppings to the selected pizza
	//UPDATE this method to use input helper
	public void askForToppings(Pizza pizza){
		String wantToppings = InputHelper.readString("Do you want to add toppings for $0.50 each? Type \"yes\" or \"YES\" if you want to add toppings to your pizza and any other keys if you don't want toppings.");
		boolean finishedToppings = false;
		if (wantToppings.equalsIgnoreCase("yes")){
			while(!finishedToppings){
				String topping = InputHelper.readString("Type in a topping you want, then press enter. When you are finished typing in all desired toppings, type \"stop\" or \"STOP\" then press enter.");
				if (topping.equalsIgnoreCase("STOP")){
					finishedToppings = true;
				}
				else pizza.addTopping(topping);
			}
		}
	}*/
}
