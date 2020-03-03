import java.util.Scanner;
public class Country {

    public static void main (String[] args) {

    	String countryName, firstLetter, firstThreeLetter, restOfName;

    	//input

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name of the country: ");
    	countryName = sc.nextLine();

    	//Algorithmn
    	countryName = countryName.trim();
    	firstLetter = countryName.substring(0,1).toUpperCase();
    	firstThreeLetter = countryName.substring(0,3).toUpperCase();
    	restOfName = countryName.substring(1).toLowerCase();

    	//output
    	System.out.println(firstLetter + restOfName + " (" + firstThreeLetter + ")");
    }
}