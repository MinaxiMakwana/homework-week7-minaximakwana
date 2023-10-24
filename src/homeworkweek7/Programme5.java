package homeworkweek7;

import java.util.Scanner;

/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */


public class Programme5 {
    public static void main(String[] args) {        //main method
        Scanner sc5 = new Scanner(System.in);       //identifying scanner

        System.out.println("Enter Employee ID ");       //assigning scanner to Emp.ID
        int empID = sc5.nextInt();

        System.out.println("Enter Employee Name ");     //assigning scanner to Emp.Name
        String empName = sc5.next();

        System.out.println("Enter Basic Salary");       //assigning scanner to basic salary
        double baseSal = sc5.nextDouble();

        double hra = baseSal * 0.10;                    //calculating HRA, DA, TA, PF and gross salary
        double da = baseSal * 0.08;
        double ta = baseSal * 0.09;
        double pf = baseSal * 0.20;
        double GrossSal = baseSal + hra + da + ta - pf;

        System.out.println("___________________________________");
        System.out.println("|           Salary Slip           |");
        System.out.println("|_________________________________|");
        System.out.println("|Employee ID   :" + empID + "     |");
        System.out.println("|Employee Name :" + empName + "   |");
        System.out.println("|_________________________________|");
        System.out.println("|Basic Salary  :" + baseSal + "   |");
        System.out.println("|HRA 10%       :" + hra + "       |");
        System.out.println("|TA 9%         :" + ta + "        |");
        System.out.println("|DA 8%         :" + da + "        |");
        System.out.println("|PF -20%       :" + pf + "        |");
        System.out.println("|_________________________________|");
        System.out.println("|Gross Salary  :" + GrossSal + "  |");
        System.out.println("|=================================|");

        sc5.close();        //closing scanner
    }
}
