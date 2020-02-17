
public class tally {
	
	double caloriesEaten;
	double Calrem;
	
	
	public tally(double Tcal, double add){
		
		caloriesEaten= Tcal;
		Calrem=add;
		
	}
	
	public tally(){
		
		caloriesEaten=0;
	}

	public void setCal(double Tcal){
		caloriesEaten=Tcal;
	}
	
	public double getCal(){
		
		return caloriesEaten;
	}
	
	public void setUserin(double add){
		Calrem=add;
	}
	
	public double getUserin(){
		return Calrem;
	}
	
	public double Caleaten(){
		
		caloriesEaten= caloriesEaten + Calrem;
		return caloriesEaten;
	}
}
