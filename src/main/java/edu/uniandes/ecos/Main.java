package psp0;

import java.io.FileNotFoundException;

public class Main {
	public static void main(String [] args){
		try {
			Logic logica = new Logic();
			
			String path = args[0];
			Persistence file = new Persistence(path);
			double average = logica.average(file.getSet());
			double standardDev = logica.standardDeviation(average,file.getSet());
			System.out.println("Average: "+average);
			System.out.println("Standard Deviation: "+standardDev);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
