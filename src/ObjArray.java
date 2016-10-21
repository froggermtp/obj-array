import java.util.Scanner;

/**
 * ObjArray is program that I made for practicing using arrays made of objects.
 * The name and wage for each worker is parsed from the console input, and is 
 * then stored in the workers array. The parsing ends when an empty string is 
 * parsed. The program then prints the employee with the highest wage and 
 * exits the program.
 * 
 * @author Matthew Parris
 * @version 1.0.1
 *
 */
public class ObjArray {
	/**
	 * The main method is the entry point for the program.
	 * 
	 * @param args Not used
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Scanner fields = null;
		
		// The maximum amount of employees the company can apparently afford
		final int MAX_NAMES = 500;
		// Holds a reference to each employee. Can have no more employees
		// than MAX_NAMES
		Employee [] workers = new Employee[MAX_NAMES];
		
		// Keeps count of how many employees have been inputed by the user
		int count = 0;
		while (count < MAX_NAMES) {
			System.out.print("Enter name and wage: ");
			String record = console.nextLine();
			
			// When the users enters an empty record, stop parsing the input
			if (record.length() <= 0) break;
			
			fields = new Scanner(record);
			String name = fields.next();
			double wage = fields.nextDouble();
			
			workers[count] = new Employee(name, wage);
			
			++count;
		}
		
		if (fields != null) fields.close();
		
		// As long as the user enters at least one employee, find the employee
		// with the highest wage, and print their hard work to the world
		if (count > 0) {
			int index = imaxwage(workers, count);
			
			System.out.printf("%s has the highest wage: $%.2f", 
					workers[index].getName(), workers[index].getWage());
		}
		
		console.close();
	}
	
	/**
	 * This function finds the Employee in an array of of Employees that has the
	 * highest wage. Must enter the last index to process, count, to avoid 
	 * accessing instances that don't exist.
	 * 
	 * @see Employee
	 * 
	 * @param list The employees to judge based on economic status
	 * @param count The indexes of employees to process, used to prevent messing
	 * employees that don't exist
	 * @return the index of list that contains the richest employee
	 */
	public static int imaxwage(Employee [] list, int count) {
		// This index will be replaced if an Employee with higher wage is found
		int richestIndex = 0;
		
		for (int index = 1; index < count; index++) {
			if (list[index].getWage() > list[richestIndex].getWage())
				richestIndex = index;
		}
		return richestIndex;
	}
}
