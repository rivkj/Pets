
//	Create a Custom Class (anything you want - car, phone, holiday, etc.). 
//
//	Requirements: 
//
//	Minimum 3 private instance variables 
//	An empty constructor 
//	A constructor that uses only 2 of your 3 variables
//	A constructor that uses all 3 of your instance variables 
//	Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables 
//	A method that returns a Boolean 
//	A method that returns a String (For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. 

	public class Car {
		private String make;
		private String model;
		private int manufacturingYear;
		
	public Car() {
		make = "";
		model = "";
		manufacturingYear = 2017;
	}
	
	public Car(String make, String model) {
		this.make = make;
		this.model = model;
		manufacturingYear = 2017;
	}
	
	public Car(String make, String model, int manufacturingYear) {
		this.make = make;
		this.model = model;
		this.manufacturingYear = manufacturingYear;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getManufacturingYear() {
		return manufacturingYear;
	}
	
	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	
	@Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }
	
	public void start() {
		System.out.println("Car starts");
	}
	
	public boolean isNewCar() {
		return manufacturingYear >= 2021;
	}
	
}
