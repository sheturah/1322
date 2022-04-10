package insurance;

public class HealthInsurancePolicy extends InsurancePolicy implements Deductible{
	
private double deductibleLimit;
private double totalDeductiblePaid = 0;
private double coPayment;
private double totalCoPaymentPaid = 0;
private double totalOutOfPocket;

HealthInsurancePolicy(String policyHolder, double deductibleLimit,double coPayment, double totalOutOfPocket)
{
	super(policyHolder);
	this.deductibleLimit = deductibleLimit;
	this.coPayment = coPayment;
	this.totalOutOfPocket = totalOutOfPocket;
}

public double getDeductibleLimit() {
	return deductibleLimit;
}

public void setDeductibleLimit(double deductibleLimit) {
	this.deductibleLimit = deductibleLimit;
}

public double getTotalDeductiblePaid() {
	return totalDeductiblePaid;
}

public void setTotalDeductiblePaid(double totalDeductiblePaid) {
	this.totalDeductiblePaid = totalDeductiblePaid;
}

public double getCoPayment() {
	return coPayment;
}

public void setCoPayment(double coPayment) {
	this.coPayment = coPayment;
}

public double getTotalCoPaymentPaid() {
	return totalCoPaymentPaid;
}

public void setTotalCoPaymentPaid(double totalCoPaymentPaid) {
	this.totalCoPaymentPaid = totalCoPaymentPaid;
}

public double getTotalOutOfPocket() {
	return totalOutOfPocket;
}

public void setTotalOutOfPocket(double totalOutOfPocket) {
	this.totalOutOfPocket = totalOutOfPocket;
}
 @Override
 public void selectPolicyCoverage()
 {
	 System.out.println("Selecting Policy Coverages");
 }
 
 @Override
 public void calculatePremium()
 {
	 System.out.println("Calculating and Updating Premium");
 }
 

 public boolean hasMetDeductible()
 {
	 if(totalDeductiblePaid>=deductibleLimit)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 

 public boolean hasMetTotalOutOfPocket()
 {
	 if((totalDeductiblePaid + totalCoPaymentPaid)>= totalOutOfPocket)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 
 @Override 
 public String toString()
 {
	 String statement = "Deductible Limit: " + getDeductibleLimit() + 
				"\nTotal Deductible Paid: " + getTotalDeductiblePaid() +
				"\nNumber of Policies: " + getCoPayment() +
				"\nCoPayment: " + getTotalCoPaymentPaid() +
				"\nTotal Out Of Pocket: " + getTotalOutOfPocket();
		return statement;
 }
 
 
}
