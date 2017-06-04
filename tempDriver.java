package temperature;
import java.util.Scanner;

public class tempDriver {
	
	public static void main(String[] args){
		System.out.print("Welcome! ");
		temp myTemp;
		
		
		while(true){
		
		System.out.println(" please input a temperature");
		
		Scanner reader = new Scanner (System.in);
		double temp = reader.nextDouble();
		
		System.out.println("Please specify a temperature unit(F, C, K)");
		String unit = reader.next();
		
		myTemp = new temp(temp,unit.toUpperCase());
		
		if(myTemp.isValid)
			break;
		
		}
		
		System.out.println(myTemp.Kel     + " Degrees Kelvin");
		System.out.println(myTemp.Fah     + " Degrees Fahrenheit");
		System.out.println(myTemp.Cel     + " Degrees Celcius");
	}
	
}

