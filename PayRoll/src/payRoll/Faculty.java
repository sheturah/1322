package payRoll;

public class Faculty extends Employee{

	private double weeklySalary;
	private double weeklyStipend;
	private double totalWeeklyPay;
	
	Faculty(String name, double weeklySalary,double weeklyStipend)
	{
		super(name);
		this.weeklySalary = weeklySalary;
		this.weeklyStipend = weeklyStipend;
		
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklyStipend() {
		return weeklyStipend;
	}

	public void setWeeklyStipend(double weeklyStipend) {
		this.weeklyStipend = weeklyStipend;
	}

	public double getTotalWeeklyPay() {
		return totalWeeklyPay;
	}

	public void setTotalWeeklyPay(double totalWeeklyPay) {
		this.totalWeeklyPay = totalWeeklyPay;
	}
	
	public void calculateWeeklyPay()
	{
		totalWeeklyPay = weeklySalary + weeklyStipend;
	}
	
	@Override
	 public String toString()
	 {
		
		return "Faculty Name: " + super.getName() + ", Salary: " + getWeeklySalary() + ", Stipend: " +
				getWeeklyStipend() + ", Weekly Pay: " + getTotalWeeklyPay();
	 }
}
