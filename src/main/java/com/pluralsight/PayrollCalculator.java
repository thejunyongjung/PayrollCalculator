package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("This is the Payroll Calculator");

        System.out.print("Enter the number of employee: ");
        String name = read.nextLine();
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = read.nextDouble();
        System.out.print("Enter the pay rate: ");
        double payRate = read.nextDouble();

        double grossPay = hoursWorked * payRate;

        System.out.printf("Employee: %s, Gross Pay: $%,.2f", name, grossPay);
    }
}
