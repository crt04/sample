package com.assurant;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//@SpringBootApplication
public class Sample {

	private static String oneString = "ChadRT";
	private static String secondString = "ChadRTurner";

    public static void main( String[] args )
    {
 //      SpringApplication.run(Sample.class, args);
      // lookAndSaySequence();
       twoDArray(3);
//       System.out.println("ONLY ONE EDIT: " + checkForOneEdit());
//       System.out.println(oneString + "   " + secondString);
    }


	//facebook #3
	public static int[][] twoDArray(int arraySize){
		
		int[][] completeArray = new int[arraySize][arraySize];
		int rowMax = arraySize;
		int colMax = arraySize;
		
		for(int r=0; r<completeArray.length; r++) {	
			System.out.println("completeArray length: " + completeArray.length);
			for(int c=0; c<completeArray[r].length; c++) {
				completeArray[r][c] = r + c;
				System.out.print(completeArray[r][c] + "\t");	
				}
			System.out.println("\n");	
		}

		
	//	System.out.println(Arrays.deepToString(completeArray)  + "\n");

		
		return completeArray;
		
	}

//SAMPLE QUESTION FOR FACEBOOK
public static boolean checkForOneEdit() {
	boolean onlyOneEdit = true;
	boolean oneStringLarger = false;
	
	int oneEditCounter  = 0;
	int diffStringSize = 0;
	
	char[] oneStringArr = oneString.toLowerCase().toCharArray();  //Convert string to char arrary to iterate over
	char[] secondStringArr = secondString.toLowerCase().toCharArray();   //Convert string to char arrary to iterate over
	
	diffStringSize = oneString.length() - secondString.length();
	
	
	//if string size difference is more than 2 then we know its more than one edit
	if(diffStringSize > 1 || diffStringSize < -1) {
		onlyOneEdit = false;		
		return onlyOneEdit;    
		
	}
	
	if( oneString.length() >=  secondString.length()) { //Determine which string is longer so when looping through dont get a Index Out of Bound error
		
		oneStringLarger = true;
	}
	
	if (oneStringLarger) {
		for (int i=0; i<secondStringArr.length; i++) {		//This loop if one string is larger than second string
			if (oneEditCounter > 1) {					//means more than one edit
				onlyOneEdit = false;
				break;
			}
			if (secondStringArr[i] == oneStringArr[i] ) {
				continue;
			}else {
				oneEditCounter += 1;
			}
		}
	}else {
		for (int i=0; i<oneStringArr.length; i++) {       //This loop if second string is larger than first string
			if (oneEditCounter > 1) {						//means more than one edit
				onlyOneEdit = false;
				break;
			}
			if (oneStringArr[i] == secondStringArr[i] ) {
				continue;
			}else {
				oneEditCounter += 1;
			}
		}
		
	}	
	
	return onlyOneEdit;
	
}

	//facebook Question 2
	public static void lookAndSaySequence() {
		
		int sameDigitCtr = 1;
		boolean firstTimeThrough = true;
		String[] previousMember = new String[1];
		previousMember[0] = "1";
		int nbrOfLoops = 9;
		int loopCtr = 0;
		int memberSize = 0;
		StringBuffer sb = new StringBuffer();
		
		while (loopCtr < nbrOfLoops) {
			sb = new StringBuffer();
			memberSize = previousMember[0].length();
			char[] charVals = previousMember[0].toCharArray();
			char thisChar = ' ';
			char nextChar = ' ';
			for (int i=0; i<memberSize; i++) {				
				thisChar = charVals[i];
				if (i+1 < charVals.length) {
					nextChar = charVals[i+1];
					if (thisChar != nextChar) {	
						System.out.print(sameDigitCtr + Character.toString(thisChar));
						sb.append(sameDigitCtr + Character.toString(thisChar));
						sameDigitCtr = 1;  // always have at least 1
					}
					if (thisChar == nextChar && sameDigitCtr < charVals.length) {
						sameDigitCtr += 1;
					}	
				}				
				if (firstTimeThrough) {
					System.out.println(previousMember[0]);
					firstTimeThrough = false;
				}				
			}
			System.out.println(sameDigitCtr + Character.toString(thisChar));
			sb.append(sameDigitCtr + Character.toString(thisChar));
			previousMember[0] = sb.toString();
			loopCtr += 1;
			sameDigitCtr = 1;
		}		
		
	}
	
	
    //below prints numbers and build a pyramid (Macy's)
    public void buildPyramid() {
	    int number = 9;
	    int spaceCtr = number;
	    //loop through number of times
	    for(int i=0; i<=number; i++) {  
	    	spaceCtr = number;
	    	//prints number of spaces to make pyramid
	    	while((spaceCtr - i) > 0){
	    		System.out.print(" ");
	    		spaceCtr--;
	    	}
	    	//prints number on the line number of times
	    	for(int x=0; x<i; x++) {
	    		System.out.print(i + " ");
	    	}  
	    	//moves print to a new line
	    	System.out.println();
	    }    
    }
    
    //below reverse characters (Macy's)
    public void reverseCharactersOrArray() {
	    System.out.println();
	    String stringToReverse = "radarc";
	    String[] stringArray = stringToReverse.split("");
	    for(int i=stringArray.length-1; i>-1; i--) {
	    	System.out.print(stringArray[i]);
	    	if(i != 0) {
	    		System.out.print(" ");
	    	}
	    }
    }
	

	
	

	
}