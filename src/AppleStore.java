// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

//this file based off the Pizza shop file in assignment 3

import java.util.Arrays;
import java.util.Scanner;

public class AppleStore {

	// scanner used in various functions
	private Scanner sc;
	// current order of current user
	static private StoreOrder currentOrder;

	// constructor
	public AppleStore() {
		sc = new Scanner(System.in);
	
	}
	
	// main function
	public static void main(String[] args){
		AppleStore myShop = new AppleStore();
		System.out.println("Welcome to the Apple Store!");
		currentOrder = new StoreOrder();
		myShop.askForAction();
		
	}
	
	private String printItems() {
		String output = "";
		output += "1: iPhone 6\n";
		output += "2: iPhone 7\n";
		output += "3: Macbook Air\n";
		output += "4: Macbook\n";
		output += "5: Macbook Pro\n";
		output += "6: Checkout\n";
		output += "7: Cancel Order\n";
		
		return output;
	}
	
	
	//TODO: create list of products
	// asks user to select from actions in a menu
	public void askForAction(){
		boolean finished = false;
		while (!finished){
			int choice = InputHelper.readIntBetween("Choose an item to buy or another action:\n" + printItems(), 1, 7);
			switch(choice) {
			case 1: 
				addIphoneSix();
				break;
			case 2: 
				addIphoneSeven();
				break;
			case 3: 
				addMacbookAir();
				break;
			case 4: 
				addMacbook();
				break;
			case 5:
				addMacbookPro();
				break;
			case 6:
				System.out.println(String.format("Your order of %d item(s) costs $%.2f. Thank you for coming, and we hope to see you again soon.", currentOrder.getNumOrders(), currentOrder.getTotalCost()));
				finished = true;
				break;
			case 7:
				System.out.println("We're sorry you've decided to cancel your order. Have a good day, and we hope to see you again soon.");
				finished = true;
				break;
			}
		}
	}
	

		
	// different creators for different items
	private void addIphoneSix() {
		CartObject phone = new IphoneSix(askForColor(), askForPhoneMemory());
		System.out.println("New iPhone 6 added to order");
		currentOrder.addOrder(phone);
	}
	
	private void addIphoneSeven() {
		CartObject phone = new IphoneSeven(askForColor(), askForPhoneMemory());
		System.out.println("New iPhone 7 added to order");
		currentOrder.addOrder(phone);
	}
	
	private void addMacbookAir() {
		CartObject macbookAir = new MacbookAir(askForColor(), askForLaptopMemory());
		System.out.println("New Macbook Air added to order");
		currentOrder.addOrder(macbookAir);
	}
	
	private void addMacbook() {
		CartObject macbook = new Macbook(askForColor(), askForLaptopMemory());
		System.out.println("New Macbook added to order");
		currentOrder.addOrder(macbook);
	}
	
	private void addMacbookPro() {
		CartObject macbookPro = new MacbookPro(askForColor(), askForLaptopMemory());
		System.out.println("New Macbook Pro added to order");
		currentOrder.addOrder(macbookPro);
	}

	private Color askForColor() {
		boolean isValid = false;
		Color color = null;
		while(!isValid) {
			String prompt = ("What color do you want your item to be?" + Arrays.toString(Color.values()));
			String input = InputHelper.readString(prompt).toUpperCase().replaceAll(" ", "");
			try {
				color = Color.valueOf(input);  //can throw an exception if input is not in enum
				isValid = true;
			}
			catch(Exception e) {
				System.out.println(input + " was not recognized as a valid color option");
			}
		}
		
		return color;
	}
	
	private PhoneMemory askForPhoneMemory() {
		boolean isValid = false;
		PhoneMemory mem = null;
		while(!isValid) {
			String prompt = ("How much memory do you want your phone to have? (Do NOT use numbers)" + Arrays.toString(PhoneMemory.values()));
			String input = InputHelper.readString(prompt).toUpperCase().replaceAll(" ", "");
			try {
				mem = PhoneMemory.valueOf(input);  //can throw an exception if input is not in enum
				isValid = true;
			}
			catch(Exception e) {
				System.out.println(input + " was not recognized as a valid color option");
			}
		}
		
		return mem;
	}
	
	private LaptopMemory askForLaptopMemory() {
		boolean isValid = false;
		LaptopMemory mem = null;
		while(!isValid) {
			String prompt = ("How much memory do you want your laptop to have? (Do NOT use numbers)" + Arrays.toString(LaptopMemory.values()));
			String input = InputHelper.readString(prompt).toUpperCase().replaceAll(" ", "");
			try {
				mem = LaptopMemory.valueOf(input);  //can throw an exception if input is not in enum
				isValid = true;
			}
			catch(Exception e) {
				System.out.println(input + " was not recognized as a valid color option");
			}
		}
		
		return mem;
	}
}
