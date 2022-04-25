package blueRay;

public class BlueRayDisk {

	public String title;
	public String director;
	public int yearOfRelease;
	public double cost;
	
	public BlueRayDisk(String title, String director, int yearOfRelease, double cost) {
		super();
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "$" + cost + " " + yearOfRelease + " " + title + ", " + director;
	}
	
}
