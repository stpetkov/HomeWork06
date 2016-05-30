package Task64;

import java.util.Arrays;
import java.util.Scanner;

class Market {
	@Override
	public String toString() {
		return "Market [name=" + name + ", address=" + address + ", stock=" + Arrays.toString(stock) + ", sc=" + sc
				+ "]";
	}

	private String name;
	private String address;
	private String stock[];
	Scanner sc = new Scanner(System.in);

	public void add() {

		for (int i = 0; i < stock.length; i++) {
			System.out.print("Enter new product: ");
			stock[i] = sc.nextLine();
		}
	}

	public void check() {
		int quant[] = new int[stock.length];
		System.out.println("Enter quantities of products");
		for (int i = 0; i < stock.length; i++) {
			System.out.println(stock[i] + " : ");
			quant[i] = sc.nextInt();			
			}
		for(int i=0;i<quant.length;i++){
			if(quant[i]==0){
				System.out.println(stock[i]+" is out of stock !");
			}
		}
	}

	public String getName() {
		return name;
	}

	public Market(String name, String address, String[] stock) {
		super();
		this.name = name;
		this.address = address;
		this.stock = stock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAdress(String address) {
		this.address = address;
	}

	public String[] getStock() {
		return stock;
	}

	public void setStock(String[] stock) {
		this.stock = stock;
	}
}

public class Main {

	public static void main(String[] args) {
		String shop[] = new String[5];
		Market shopa = new Market("Maufland", "Car Simeon #4", shop);
		shopa.add();
		shopa.check();
shopa.toString();
	}

}
