package managementSystem;

public class Node {
	public JobLead jobLead;
	public Node prev;
	public Node next;
	
	public Node(JobLead jobLead)
	{
		this.jobLead = jobLead;
		prev = null;
		next = null;
	}

	public Node() {
		
	}

}
