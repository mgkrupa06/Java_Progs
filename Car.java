package source;

public class Car {

	    private String brand;
	    private String model;
	    private double price;
	    private double mileage;
	    private String ownerName;
	    
	    private static int totalCars;          
	    private static String showroomName = "AutoXcellence";  

	    public Car(String b, String m, double p, double mil) {
	        this.brand=b;
	        this.model=m;
	        this.price=p;
	        this.mileage=mil;
	        ownerName = "Krupa";
	        totalCars++;
	        
	    }
	    public Car(String b, String m, double p, double mil, String owner) {
	        this.brand = b;  
	        this.model = m;  
	        this.price = p;  
	        this.mileage = mil;  
	        this.ownerName = owner;
	        totalCars++;
	    }

	    public String getOwnerName() {
	        return this.ownerName;
	    }

	    public void setOwnerName(String owner) {
	        this.ownerName = owner;
	    }

	    public void displayDetails() {
	        System.out.println("Brand: " + this.brand);
	        System.out.println("Model: " + this.model);
	        System.out.println("Price: " + this.price);
	        System.out.println("Mileage: " + this.mileage);
	        System.out.println("Owner: " + this.ownerName);
	    }

	    public void updatePrice(double newPrice) {
	        this.price = newPrice;
	    }

	    public static void showTotalCars() {
	        System.out.println("Total Cars: " + totalCars);
	    }

	    public static void showShowroomName() {
	        System.out.println("Showroom: " + showroomName);
	    }
	}
