package psp0;

import java.util.LinkedList;

public class Logic {
	
	public double average(LinkedList<Double> set){
		double result = 0;
		for (Double temp : set) 
			result += temp;
        
		return result/set.size();
	}
	
	public double standardDeviation(double average,LinkedList<Double> set){
		double result = 0;
		for (Double temp : set) 
			result += Math.pow(temp-average, 2);
		return Math.sqrt(result/(set.size()-1));
	}
}
