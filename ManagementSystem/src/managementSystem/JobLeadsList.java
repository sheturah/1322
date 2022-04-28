package managementSystem;



public class JobLeadsList {

	private Node head;
	private Node tail;
	
	public JobLeadsList()
	{
		head = null;
		tail = null;
	}
	
	//this works well
	public void addToFront(String companyName, String contactName, String contactPhone, String jobTitle, String jobDescription)
	{
		JobLead leader = new JobLead(companyName, contactName, contactPhone, jobTitle, jobDescription);
		Node newNode = new Node(leader);
		
		//if the list is empty
		if(head == null)
		{
		head = newNode;
		tail = newNode;
		head.prev = null;
		}
		//add node to the head of the list
		else
		{
			//head previous node will be newNode
			head.prev = newNode;
			//newNodes next node will be head
			newNode.next = head;
			//newNodes previous will point to null
			newNode.prev = null;
			//newNode will become new head
			head = newNode;
			
		}
	}
	
	//this works well
	public void addToTail(String companyName, String contactName, String contactPhone, String jobTitle, String jobDescription)
	{
		JobLead leader = new JobLead(companyName, contactName, contactPhone, jobTitle, jobDescription);
		
        // Node object
        Node n1 = new Node(leader);

        // update head if it is null
        if (head == null) {
            head = n1;
        }

        // update tail
        if (tail == null) {
            tail = n1;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            n1.prev = temp;
            temp.next = n1;
            tail = n1;
        }
		
	}
	
	//
	public void removeLead(String companyName, String contactName)
	{
		boolean found  = false;
		if(head == null)
		{
			System.out.println("The list is empty");
			return;
		}
		else {
		//search the list remove the list element
		Node current = head;
		
		
		while(current != null)
		{
			//find the node in the list
			if(current.jobLead.getCompanyName().matches(companyName) &&current.jobLead.getContactName().matches(contactName) )
			{	
				found = true;
				System.out.println("The person was found");
				 
				//if it is the head
			if(current == head)
			{
				head = head.next;
				current = null;
				head.prev = null;
			}
			//if it is the tail
			else if (current == tail)
			{
				tail = current.prev;
				current = null;
				tail.next = null;
			}
			//if its in the middle
			{
				Node previousNode = current.prev;
                previousNode.next = current.next;
			}
				System.out.println("The node was deleted");
				break;
			}
			else
			{
				current = current.next;
			}
			
		}
		if(found == false)
		{
		System.out.println("The person was not found");	
		}
		}
	}
	
    public void printHeadToTail() {

        // if list is empty
        if (head == null) {
            System.out.println("List is Empty");
        } else {

            // traverse through list
            Node current = head;

            while (current != null) {
                // print JobLead object
          
                System.out.println(current.jobLead.toString());
                current = current.next;
            }
        }
    }
    
    public void printTailToHead() {

        // if list is empty
        if (head == null) {
            System.out.println("List is Empty");
        } else {

            // traverse through list
            Node current = tail;

            while (current != null) {
                // print JobLead object
            	String statement = current.jobLead.toString();
                System.out.println(statement);
                current = current.prev;
            }
        }}
	
}
