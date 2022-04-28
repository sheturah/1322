package managementSystem;

public class JobLead {

	private String companyName;
	private String contactName;
	private String contactPhone;
	private String jobTitle;
	private String jobDescription;
	
	public JobLead(String companyName, String contactName, String contactPhone, String jobTitle,
			String jobDescription) {
		super();
		this.companyName = companyName;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	
	public String toString() {
		return "Company: " + companyName + ", Name: " + contactName + ", Phone: " + contactPhone
				+ ", Job Title: " + jobTitle + ", Job Description: " + jobDescription + "\n";
	}
	
	
}
