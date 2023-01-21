/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grosspaycalculator;

import java.util.Scanner;

/**
 *
 * @author CHENBEIXUAN
 */
public class GrossPayCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter employee name: ");
        String emp_name = sc.nextLine();
        System.out.print("Press F for Full Time or P for Part Time: ");
        String emp_type = sc.next();
        switch(emp_type){
            case"F":
                System.out.println("--- Full Time Employee ---");
                System.out.print("Enter Basic Pay: ");
                double basic_pay = sc.nextDouble();

                System.out.println("\n____________________________");
                System.out.printf("Employee Name:\t\t%s", emp_name);
                System.out.printf("\nBasic Pay  :\t%.2f", basic_pay);
                System.out.println("\n____________________________");
                System.out.printf("Gross Pay  :\t%.2f\n", basic_pay);
                break;
           
            case"P":
                System.out.println("--- Part Time Employee ---");
                System.out.print("Enter rate per hour: ");
                double rate = sc.nextDouble();
                System.out.print("Enter no. of hours worked: ");
                int work_hours = sc.nextInt();
                System.out.print("Enter no. of overtime: ");
                int overtime_hours = sc.nextInt();

                double bp = rate*work_hours; 
                double overtime = overtime_hours*(rate*1.25);

                System.out.println("\n____________________________");
                System.out.printf("Employee Name:\t%s", emp_name);
                System.out.printf("\nBasic Pay  :\t%.2f", bp);
                System.out.printf("\nOvertime Pay  :\t%.2f", overtime);
                System.out.println("\n____________________________");
                System.out.printf("Gross Pay  :\t%.2f\n", (bp+overtime));
                break;
           
            default:
                System.out.println("\nEntered Employee type is invalid\n");
        }

        sc.close(); 
    }
}

