package oops_concept;

public class RoadToll_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Road_Toll rt=new Road_Toll();
		
		rt.tirecount=4;
		rt.type="sadan";
		rt.doCalculate();
		
		Road_Toll rt1=new Road_Toll("Truck", 6);
		rt1.doCalculate();
	}

}
