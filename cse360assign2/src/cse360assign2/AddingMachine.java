//******************************************************************************************
////////////////////////////////////////////////////////////////////////////////////////////
// Assignment #: 2
// Arizona State University - CSE360: Introduction to Software Engineering
//         Name: Chau Mai Bao Le
//    StudentID: 1215667284
//      Lecture: MONDAY: 9:40AM - 10:30AM
//  Description: 1. Understand how to create the local repository folder in git or github
//				 2. Commit the project to git and github
//				 3. Understand how to use git commit and commit change
//				 4. Understand how to use push in git
//				 5. Able to change file and commit the change to the git and github
//				 6. Able to create a string expresses all of the operators and calculations
//			     in the class
//				 7. Perform addition and subtraction
//				 8. Print the result perform all of the calculations
//     Filename: AddingMachine.java
////////////////////////////////////////////////////////////////////////////////////////////
///*****************************************************************************************


package cse360assign2;

public class AddingMachine {			//class AddingMachine

	private int total;			//total variable
	
	private String make;			//create a string in order to get get the right operator
	
	public AddingMachine () {
		total = 0;  			// not needed - included for clarity
		make = "" + total;		//start from the first value of total variable
	}
	
	public int getTotal () {		//get the value of the total variable
		return total;			//return total variable
	}
	
	public void add (int value) {		//method for addition
		total = total + value;		//add the parameter to the total variable
		make = make + " + " + value;	//create a string expresses for this event
	}	
	
	public void subtract (int value) {	//method for subtraction
		total = total - value;		//subtract the parameter from the total variable
		make = make + " - " + value;	//create a string expresses for this event
	}
		
	public String toString () {		//string value of all the events
		return make;			//return make string after all of the events
	}

	public void clear() {			//clear the current value of string make
		make = "\0";			//string back to first initial
	}
}
