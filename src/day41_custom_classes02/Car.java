package day41_custom_classes02;

public class Car {
	/*
	 * instance varible/attributes/properities/data: 
	 * make 
	 * model 
	 * currentSpeed 
	 * color
	 * ##methods
	 * printCarInfo()
	 * "car make[make], model[model[, color[color], currentSpeed[currentSpeed]"
	 * 
	 * 
	 */
	/*
	 * 2-)
	 * showCurrentSpeed
	 * return; void
	 * param: int speedLimit
	 * "Ford is driving at currentSpeed, following speed limit - 55"
	 * "Ford is driving at currentSpeed, over the speed limit - 55"
	 */
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		String info = "Car make["+make+"], model["+model+ "], color["+color+"], currentSpeed["+currentSpeed+"]";
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+ currentSpeed+", following speed limit - "+speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+", over the speed limit - "+speedLimit);

		}
	}
	public void drive() {
		System.out.println(make +" "+  model+ " is driving");
	}
	/*
	 * accelarate
	 * return type: void
	 * params: int mph
	 * increase current speed by value of mph
	 * accelerate(10);
	 * 55==>65
	 */
	public void accelerate(int mph) {
		currentSpeed = currentSpeed+mph; //currentSpeed+=mph
	}
	
	
	
	
	
	
	
}
