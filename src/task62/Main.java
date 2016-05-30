package task62;

import java.util.Arrays;

class Car {
	public Car(double d) {
		super();
		this.price = d;
	}

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

class Automobile extends Car {
	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	private int consumption;

	public Automobile(double d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

}

class SUV extends Car {

	public boolean isHigh() {
		return high;
	}

	public void setHigh(boolean high) {
		this.high = high;
	}

	boolean high;

	public SUV(double d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

}

public class Main {

	public static void main(String[] args) {
		Car cars[] = new Car[10];
		for (int i = 0; i < 5; i++) {
			cars[i] = new SUV(i + Math.random());
			
		}
		for (int i = 5; i < cars.length; i++) {
			cars[i] = new Automobile(i + Math.random());
		}
		
//		 Arrays.sort(cars);
		System.out.print(Arrays.toString(cars));
	}

}
