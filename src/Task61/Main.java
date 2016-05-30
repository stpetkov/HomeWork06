package Task61;

class Cat {
	private String name;
	private int years;

	public void say() {
		System.out.println("Cat [name=" + name + ", years=" + years + "]");
	}

	public String getName() {
		return name;
	}

	public Cat(String name, int years) {
		super();
		this.name = name;
		this.years = years;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
}

public class Main {

	public static void main(String[] args) {
		Cat cats[] = new Cat[10];
		for (int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Cat#(" + i + ")", (i + i * 2));
			cats[i].say();
		}
	}

}
