import java.util.Scanner;


public class Controller {
	
	
	
	
	Scanner scan= new Scanner(System.in);
	
	
	tally tot=new tally();
	
	public void begin(){
	
		System.out.print("Continue Y/N");
		String val=scan.next();
		do{
		
		System.out.print("Enter your name \n" );
		double name=scan.nextFloat();	
		tot.setUserin(name);
		
		System.out.println(tot.Caleaten());
		}
		while(val!= null);
		
	}
	
	

	
}
