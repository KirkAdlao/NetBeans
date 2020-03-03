import java.util.Scanner;
public class AgeCalculator {

    public static void main(String[] args) {
        Int date;
        int yearOfBirth,currentYear,age;
        Date today = new Date();
        Scanner sc = new Scanner(System.in);
        
        System.err.println("Please enter year of birth: ");
        yearOfBirth= sc.nextInt();
        
        currentYear = today.getYear() + 1900;
        System.err.println("The current year is: " + currentYear);
        
        age = currentYear - yearOfBirth;
    }
}    