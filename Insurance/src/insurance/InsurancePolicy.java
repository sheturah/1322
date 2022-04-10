package insurance;

public abstract class InsurancePolicy {

	private String policyHolder;
	private int policyNumber;
	private static int numberOfPolicies = 0;
	private double premium =0;
	
	public InsurancePolicy(String policyHolder) {
		
		this.policyHolder = policyHolder;
		this.policyNumber = ++numberOfPolicies;
	}

	public String getPolicyHolder() {
		return policyHolder;
	}

	public void setPolicyHolder(String policyHolder) {
		this.policyHolder = policyHolder;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public static int getNumberOfPolicies() {
		return numberOfPolicies;
	}

	public static void setNumberOfPolicies(int numberOfPolicies) {
		InsurancePolicy.numberOfPolicies = numberOfPolicies;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
	public abstract void selectPolicyCoverage();
	public abstract void calculatePremium();
	
	@Override
	public String toString()
	{
		String statement = "Policy Holder: " + getPolicyHolder() + 
				"\nPolicy Number: " + getPolicyNumber() +
				"\nNumber of Policies: " + getNumberOfPolicies() +
				"\nPremium: " + getPremium();
		return statement;
	}
	
}
