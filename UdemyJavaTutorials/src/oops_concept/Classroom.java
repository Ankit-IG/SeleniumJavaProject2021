package oops_concept;

public class Classroom {

	String sub1;
	int stdcount1;
	
	
	public String getSub() {
		return sub1;
	}


	public void setSub(String sub) {
		this.sub1 = sub;
	}


	public int getStdcount() {
		return stdcount1;
	}


	public void setStdcount(int stdcount) {
		this.stdcount1 = stdcount;
	}


	public void displayDetails() {
		System.out.println("This is a "+sub1+" classrom and it has "+stdcount1+" students");
	}

}
