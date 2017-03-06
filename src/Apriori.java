//base project, Negin Sauermann section
//Referenced Apriori Algorithm by Nathan Magnus, 2009 (http://www2.cs.uregina.ca/~dbd/cs831/notes/itemsets/itemset_prog1.html)
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Apriori {
	              
	//declaring variables and initializing 
	double minSupp = 0.0; //minimum support for frequent item sets
	double minRate = 0.0; //minimum confidence rate for declaration 
	
	String inputFile = ""; //text file from user
	String outputFile = ""; //output file with rules
	Scanner keyboard = new Scanner(System.in); //userInput
	
	double currentItemS = 0;
	ArrayList<String> data;
	ArrayList<String> dataType;
	
	//getter and setters
	public double getminSupp() {
		return minSupp;
	}

	public double getminRate() {
		return minRate;
	}

	public String getinputFile() {
		return inputFile;
	}

	public double getCurrentItemS() {
		return currentItemS;
	}
	
	

	public void getInput(){
		System.out.println("What is the file name?");
		inputFile = keyboard.nextLine();
	
		
		System.out.println("Select the minium support rate, values range from 0.00-1.00:");
		minRate = keyboard.nextDouble();
		//ensure that the confidence rate is within the boundaries of 0 and 1
		if (minRate> 1 | minRate < 0)
		{
		System.out.println("The confidence rate you entered is invalid, please enter another value: ");
		minRate = keyboard.nextDouble();
		}
		
			
		System.out.println("Please select the minimum confidence rate, values range from 0.00-1.00):");
		minSupp = keyboard.nextDouble();
		//ensure that the support rate is within the boundaries of 0 and 1
		if (minSupp > 1 | minSupp < 0)
		{
		System.out.println("The support value you entered is invalid, please enter another value: ");
		minSupp = keyboard.nextDouble();
		}

		keyboard.close();
	
	}//end getInput

public static runApriori() {
	// TODO Auto-generated method stub
	
	
}

	
}

