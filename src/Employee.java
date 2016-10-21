/**
 * Employee serves as a container for an individual employee's data.
 * 
 * @author Matthew Parris
 * @version 1.0
 */
public class Employee {
	// A word assigned to a person, most often by their parents
	private String name;
	// 10 bands, 50 bands, 100 bands, whatever...
	private double wage;
	
	/**
	 * Class constructor.
	 * 
	 * @param name
	 * @param wage
	 */
	public Employee(String name, double wage) {
		this.name = name;
		this.wage = wage;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		this.wage = wage;
	}
	
}
