package Таск63;

abstract class Stock {
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	private int price;
	private boolean available = true;
}

class Meat extends Stock {
	public Meat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int kg;
	private String name;
}

class Vegetables extends Stock {
	public int getNitrats() {
		return nitrats;
	}
	public void setNitrats(int nitrats) {
		this.nitrats = nitrats;
	}
	public String getBs() {
		return bs;
	}
	public void setBs(String bs) {
		this.bs = bs;
	}
	private int nitrats;
	private String bs;
}

class Fruits extends Stock {
	public int getSweet() {
		return sweet;
	}
	public void setSweet(int sweet) {
		this.sweet = sweet;
	}
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
		this.ds = ds;
	}
	private int sweet;
	private String ds;
}

class Drinks extends Stock {
	public int getLitres() {
		return litres;
	}
	public void setLitres(int litres) {
		this.litres = litres;
	}
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	private int litres;
	private String fs;
}

class Deserts extends Stock {
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAs() {
		return as;
	}
	public void setAs(String as) {
		this.as = as;
	}
	private int count;
	private String as;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
