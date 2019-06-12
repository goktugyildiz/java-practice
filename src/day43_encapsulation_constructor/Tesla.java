package day43_encapsulation_constructor;

public class Tesla {

	/*
	 * instance variables - Encapsulated:
	 * 			model
	 * 			range
	 * 			zeroTo60
	 * 			price
	 * 			selfDriving
	 */
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDribing) {
		//call setter method for each parameter
		//this.model = model;
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}
	
	/*
	 * method name is ValidModel
	 * return boolean
	 * params: String model
	 * model s
	 * model 3
	 * model x
	 * model y
	 * Roadster
	 */
	public boolean isValidModel(String model) {
		model = model.toLowerCase();
		if(model.equals("model s") ||model.equals("model x") ||
				model.equals("model 3")||model.equals("model y")||
				model.equals("roadster")) {
			return true;
			
		}
		return false;
		
		/*
		 * return   model.equals("model s") ||
		 * 			model.equals("model x") ||
					model.equals("model 3") ||
					model.equals("model y") ||
				    model.equals("model roadster"));
		 */
		
	}
	
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}
	public void setModel(String model) {
		/*
		 * call isValidModel here then assign if true
		 * if false : Invalid model - camry
		 * assign "unknown" to model
		 * 
		 */
		if(isValidModel(model)) {
		this.model = model;
		}else {
			System.out.println("Invalid Model - "+model);
			this.model = "unknown";
		}
		
	}
	public String getModel() {
		
		return model;//this.model
		
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getRange() {
		return range;
	}
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	public double getZeroTo60() {
		return zeroTo60;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	
}
