//Sheri Evangelene
//Week 3 exercises-Java
//May 18-24, 2026

import java.util.Scanner;

public class Bonus {
    public final static int UNITS_PT = 250;
    public final static int UNITS_FT = 700;
    public final static double SALES_BONUS = 5000.0;
    public final static double SALES_BONUS_RATE = 0.05;
    public final static double SALES_UNIT_REG = 20.0;
    public final static double SALES_UNIT_EXTRA = 10.0;
    public final static int SALES_UNIT_BONUS = 25;
    public final static double PARTS_BONUS = 0.1;

    public static void main(String[] args) {
 
    Scanner keysIn = new Scanner(System.in); //Scanner = input. .in = reads from keyboard
    System.out.println("Enter department: ");
    int dept = keysIn.nextInt(); //nextInt reads input as an int
    double bonus = 0;
 

        switch (dept)   {
        case 1:
            System.out.print("Enter sales: ");
            double sales = keysIn.nextDouble();
            bonus = getBonus(sales);
            break;
        case 2:
            System.out.print("Enter number of units sold: ");
            int numUnits = keysIn.nextInt();
            bonus = getBonus(numUnits);
            break;
        case 3:
            System.out.print("Enter # of pieces completed: ");
            int pieces = keysIn.nextInt();
            System.out.print("Full-time (1) or Part-Time (2)? ");
            int empType = keysIn.nextInt();
            int bonusLimit = (empType == 1) ? UNITS_FT : UNITS_PT;
            bonus = getBonus(pieces, bonusLimit);
            break;
        default:
            System.out.print("Error!  ");
     }
     System.out.printf("Bonus Amount: $%.2f%n", bonus);
}
 
    public static double getBonus(double sales){
        double bonus= 0;
        if(sales >= SALES_BONUS){
            bonus = sales *SALES_BONUS_RATE;
        }
        return bonus;
    }

     public static double getBonus(int numUnits){
        double bonus = 0;
        if (numUnits < SALES_UNIT_BONUS){
            bonus = numUnits * SALES_UNIT_REG;
        } else if(numUnits >= SALES_UNIT_BONUS){
            bonus = (SALES_UNIT_EXTRA + SALES_UNIT_REG) * numUnits;
        }
        return bonus;
     }

     public static double getBonus(int pieces, int bonusLimit){
        double bonus = 0;
        if (pieces >= bonusLimit){
            bonus = pieces * PARTS_BONUS;
        }
        return bonus;
     }



}
