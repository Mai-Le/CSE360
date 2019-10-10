package cse360assign2;

public class AddingMachine {

	private int total;
	
	private String make;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		make = "" + total;
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		make = make + " + " + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		make = make + " - " + value;
	}
		
	public String toString () {
		return make;
	}

	public void clear() {
		make = "\0";
	}
}
