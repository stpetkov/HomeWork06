package Task66;

class Employee {
	protected int workingHoursPM;
	protected int paymentPM;
	public void infoE() {
		System.out.print("Employee   workingHoursPM ="+ workingHoursPM + ", paymentPM=" + paymentPM + "]");
	}
	public Employee(int workingHoursPM, int paymentPM) {
		super();
		this.workingHoursPM = workingHoursPM;
		this.paymentPM = paymentPM;
	}

	public int getWorkingHoursPM() {
		return workingHoursPM;
	}

	public void setWorkingHoursPM(int workingHoursPM) {
		this.workingHoursPM = workingHoursPM;
	}

	public int getPaymentPM() {
		return paymentPM;
	}

	public void setPaymentPM(int paymentPM) {
		this.paymentPM = paymentPM;
	}
}

class Policeman extends Employee {

	public void infoP() {
		System.out.print(
				"Policeman [rank=" + rank + "][workingHoursPM=" + workingHoursPM + ", paymentPM=" + paymentPM + "]");
	}

	public Policeman(int workingHoursPM, int paymentPM) {
		super(workingHoursPM, paymentPM);
	}

	private String rank;

	public String getRank() {
		return rank;
	}

	public void setRank(String rang) {
		this.rank = rank;
	}
}

class Doctor extends Employee {
	public void infoD() {
		System.out.print("Doctor [nightshifts=" + nightshifts + ", dayshifts=" + dayshifts + ", workingHoursPM="
				+ workingHoursPM + ", paymentPM=" + paymentPM + "]");
	}

	public Doctor(int workingHoursPM, int paymentPM) {
		super(workingHoursPM, paymentPM);
	}

	public int getNightshifts() {
		return nightshifts;
	}

	public void setNightshifts(int nightshifts) {
		this.nightshifts = nightshifts;
	}

	public int getDayshifts() {
		return dayshifts;
	}

	public void setDayshifts(int dayshifts) {
		this.dayshifts = dayshifts;
	}

	private int nightshifts;
	private int dayshifts;
}

public class Main {

	public static void main(String[] args) {
		Employee gosho=new Employee(90,1800);
		gosho.infoE();
	}

}
