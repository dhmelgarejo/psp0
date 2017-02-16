package psp0;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Persistence {
	private BufferedReader br;
	private String path;
	private LinkedList<Double> set;
	
	public LinkedList<Double> getSet() {
		return set;
	}

	public Persistence(String path) throws FileNotFoundException{
		set = new LinkedList<Double>();
		this.path = path;
		br = new BufferedReader(new FileReader(this.path));
		init();
	}
	
	private void init() throws FileNotFoundException{
		try {
		    String line = br.readLine();
		    while (line != null) {
		    	System.out.println("Dato "+(set.size()+1)+": "+line);
				set.add(Double.parseDouble(line));
		        line = br.readLine();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
