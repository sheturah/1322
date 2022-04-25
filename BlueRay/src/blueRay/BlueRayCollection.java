package blueRay;

public class BlueRayCollection {

	private Node head = null;
	
	public void add(String title, String director, int yearOfRelease, double cost)
	{
		
		BlueRayDisk b1 = new BlueRayDisk(title, director, yearOfRelease, cost);
		Node blueRay = new Node(b1);
		
		if(head == null)
		{
			head = blueRay;
			return;
		}
		
		blueRay.next = null;
		Node current = head;
		while(current.next!= null)
		{
			current = current.next;
		}
		
		current.next = blueRay;
		
	}
	
	  public void show_all()
      {
          Node updatedNode = head;
          while (updatedNode != null)
          {
              System.out.println(ToString(updatedNode));
              updatedNode = updatedNode.next;
          }
      }
	
    public String ToString(Node updatedNode)
    {
    return "$" + updatedNode.data.cost + " " + updatedNode.data.yearOfRelease + " " + updatedNode.data.title + "," + updatedNode.data.director;
    }
}
