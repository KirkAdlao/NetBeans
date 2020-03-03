import java.util.Scanner;
public class SalaryCalculator {

    public static void main (String[] args) {
        
        double hourlyWage , workedHours, totalSalary, netPay;
        final double Tax_DEDUCTIONS = 0.3;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hourly wage: ");
        hourlyWage = sc.nextDouble();
        System.out.println("Enter the worked hours: ");
        workedHours = sc.nextDouble();
        
        // algorithmn to solve problem
        totalSalary = hourlyWage * workedHours;
        netPay = totalSalary - (totalSalary + Tax_DEDUCTIONS);
        
        //output
        
        System.out.println("Your total salary is " + totalSalary);
        System.out.println("Your net pay is " + netPay);
    }
}