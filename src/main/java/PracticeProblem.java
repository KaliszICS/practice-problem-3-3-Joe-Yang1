/**
 * File: Else if
 * Author: Joe Yang
 * Date Created: March 25, 2026
 * Date Last Modified: March 25, 2026
 */

import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static String evenOrOdd(int num){
	if (num % 2 != 0){
		return "Odd";
	}
	else if(num == 0){
		return "Zero";
	}
	else{
		return "Even";
	}
}

	public static String positiveOrNegative(int num){
	if (num < 0){
		return "Negative";
	}
	else if (num == 0){
		return "Zero";
	}
	else { 
		return "Positive";
	}

}

	public static String pluralize(String word){
	word = word.toLowerCase();
	if (word.endsWith("ey")){
		return "eys";
	}
	else if (word.endsWith("y")){
		return "ies";
	}
	
	else if (word.endsWith("ife")){
		return "ives";
	}
	else {
		return "s";
	}
	
}
}
