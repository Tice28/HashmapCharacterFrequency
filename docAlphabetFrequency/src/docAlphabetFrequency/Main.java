package docAlphabetFrequency;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		HashMap<Character, Integer> freqArray = new HashMap<>();			//Hashmap is used to hold the kvp of characters to their frequencies						
		String filePath ="src/docAlphabetFrequency/test.txt";				//File path used to determine what file to open
		String temp;

		Scanner s = new Scanner(new File(filePath)); 					//Scanner object used to import file
		
		while(s.hasNext()) {
			temp = s.nextLine();							//Temp reads in next line that is converted to a string
			for(int i = 0;i<temp.length();i++) {
				if(freqArray.containsKey(temp.charAt(i))) {			//Checks to see if character has already been logged
					int tempInt = freqArray.get(temp.charAt(i))+1;
					freqArray.replace(temp.charAt(i), tempInt);
				} else {							//Adds character if it has not been logged
					freqArray.put(temp.charAt(i), 1);
				}
			}
			
		}
		System.out.println(freqArray.toString());					//Prints resulting hashmap
	}

}
