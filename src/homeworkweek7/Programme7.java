package homeworkweek7;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {

    public static void main(String[] args) {        //main method
        Scanner sc7 = new Scanner(System.in);       //identifying scanner

        System.out.print("Enter Sales Id: ");       //assigning scanner to sales Id
        int salesId = sc7.nextInt();

        System.out.print("Enter Seller's Name: ");      //assigning scanner to seller's name
        String sellerName = sc7.next();

        System.out.println("Enter Sales Amount :");     //assigning scanner to sales amount
        double salesAmount = sc7.nextDouble();

        System.out.println("Enter Basic Salary : ");    //assigning scanner to basic salary
        double basicSalary = sc7.nextDouble();

        double commissionRate;                          //using double for commission rate

        if (salesAmount >= 50000){                      //using if else statement to set parameters
        commissionRate = 0.35;
        } else if (salesAmount >= 30000){
        commissionRate = 0.20;
        } else if (salesAmount >= 20000){
        commissionRate = 0.10;
        } else if (salesAmount >= 10000){
        commissionRate = 0.05;
        } else {
        commissionRate = 0.02;
        }

        double commission = salesAmount * commissionRate;       //calculation for commission and total salary
        double totalSalary = basicSalary + commission;

        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%" );
        System.out.println("Commission: " + commission);
        System.out.println("Total salary: " + totalSalary);

        sc7.close();        //closing scanner
    }
}
