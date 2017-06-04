package temperature;

public class temp {
	public double Fah;
	public double Kel;
	public double Cel;
	
	public boolean isValid;
	
	
	public temp(double temp, String unit){
		isValid = true;
		
		
		
		if(unit.equals("K")){
			
			Kel = temp;
			Fah = (temp - 273.15) * 9/5 + 32;
			Cel = temp - 273.15;
			
			
		}
		
		else if(unit.equals("F")){
			Kel = (temp - 32) * 5/9 + 273.15;
			Fah = temp;
			Cel = (temp - 32) * 5/9;
		
			
			
		
		}else if(unit.equals("C")){
			Kel = temp + 273.15;
			Fah = (temp * 9/5) + 32;
			Cel = temp;
		
				
				
		}
		else{System.out.println("Invalid temperature unit");
		isValid = false;
		}
		
		
	}
	
	
	
	
	
	

}
