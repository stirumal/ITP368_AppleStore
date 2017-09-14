// Christine Chen, Srivas Tirumala
// ITP 368, Fall 2017
// Assignment 4
// chen410@usc.edu, stirumal@usc.edu

import java.util.ArrayList;

public class StoreOrder {
	private ArrayList<CartObject> orderArrayList;
	
	public StoreOrder() {
		orderArrayList = new ArrayList<CartObject>();
	}
	
	public void addOrder(CartObject object) {
		orderArrayList.add(object);
	}
	
	public int getNumOrders() {
		return orderArrayList.size();
	}
	
	public double getTotalCost() {
		double cost = 0.0;
		for (int i = 0; i < orderArrayList.size(); i++) {
			cost += orderArrayList.get(i).getPrice();
		}
		return cost;
	}
}
