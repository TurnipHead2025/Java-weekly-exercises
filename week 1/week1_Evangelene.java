// Sheri Evangelene
// May 7-9 2026
// week 1 exercises Java


import java.util.Scanner;

public class week1_Evangelene{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num1, num2, sum;

        System.out.println("Enter first number: ");
        num1 = input.nextInt();

        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.printf("sum = %d\n", sum); 
        System.out.println();
   


//Lab Task 1.1. (The number-word program) Write a java program which inputs a one digit number from the user (i.e. 0-9). The program should then print that number in words, e.g. “Zero” for 0, “One” for 1, “Two” for 2, and so on. If the user does not enter a one-digit number, then program should display an error: “”.

Scanner userInput = new Scanner(System.in);
   
   System.out.println("Enter a number (0-9): ");
   int daNum = userInput.nextInt();

    String daWord = "";
    if (daNum == 1){
    daWord = "one";
    } else if (daNum == 2){
     daWord = "two";
     } else if (daNum == 3){
     daWord = "three";
     } else if (daNum == 4){
     daWord = "four";
     } else if (daNum == 5){
    daWord = "five";
     } else if (daNum == 6){
    daWord = "six";
     } else if (daNum == 7){
    daWord = "seven";
     } else if (daNum == 8){
    daWord = "eight";
     } else if (daNum == 9){
    daWord = "nine";
    }  else{
         System.out.println("try again") ;
    }
   
System.out.println("You entered: " + daWord);
System.out.println();


// Lab Task 1.2. Write a program that determines and prints the largest integer among the five given integers (To print an integer, simply use System.out.println(intVarName);

// int win1 = 0, win2 = 0, win3 = 0, largeInt = 0;
// int[] numsArray= {3,4,6,7,2};

// if (numsArray[0] > numsArray[1]){
//     win1 = numsArray[0];
// } else {
//     win1 = numsArray[1];
// }

// if (win1 > numsArray[2]){
//     win2 = win1;
// } else {
//     win2 = numsArray[2];
// }

// if (win2 > numsArray[3]){
//      win3 = win2;
// } else win3 = numsArray[3];

// if (win3 > numsArray[4]){
//      largeInt = win3;
// }else largeInt = numsArray[4];

// System.out.println("The largest Int is: " + largeInt);
// System.out.println();



// Lab Task 1.3. (The solution involves a loop) A person invests $1000.0 in a business yielding 5% profit every year. Assuming that all the profit is left on deposit in the account, calculate and print the amount of money in he account at the end of each year for 10 years.

double amount = 1000;
System.out.println("Year \t\t Amount on Deposit");

for (int i = 1; i <= 10; i++){
    amount = amount * 1.05;
    System.out.printf("%d \t\t + %.2f\n", i, amount);
}
System.out.println();




// Lab Task 1.4. Test Average problem: (while loop)
// Write a program to read in numbers until the number -999 is encountered. The sum of all number read until this point should be printed out and then the average.

int number;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number (-999 to stop): ");
number = s.nextInt();
int sum14 = 0;
int count= 0;
while (number != -999) {
 sum14 = number + sum14;
 count++;
System.out.println("Enter a number (-999 to stop): ");
number = s.nextInt();
}

System.out.println("Sum = " + sum14);
System.out.printf("Average = %.2f", (double) sum14/count);
System.out.println();
     

// Lab Task 1.5. Write a java class for Simple Calculator Program using a Switch statement. The program must input 2 operands and an operator and perform a specific operation using a switch statement. (Switch Statement)

System.out.println("Please enter a number: ");
Scanner x = new Scanner(System.in);
double operand1 = x.nextDouble();

System.out.println("Please enter an operator: ");
Scanner o = new Scanner(System.in);
String operator = o.next();

System.out.println("Please enter a number: ");
Scanner z = new Scanner(System.in);
double operand2 = x.nextDouble();

switch (operator){
    case "+":
    System.out.println(operand1 + operand2);
    break;
     case "-":
    System.out.println(operand1 - operand2);
    break;
     case "*":
    System.out.println(operand1 * operand2);
    break;
     case "/":
    System.out.println(operand1 / operand2);
    break;
    default:
        System.out.println("Invalid operator");
}
System.out.println();


// Lab Task 1.6. (Arrays) Write a java class that inputs 100 integers (from 0 to 9) into an array and prints the frequency of each number in the following manner:

Scanner XX = new Scanner(System.in);
int nums10;
int[] frequency = new int[10];

for (int i = 0; i < 10; i++){
    System.out.println("Enter a number (0-9)");
    nums10 = XX.nextInt(); 
    frequency[nums10]++;  
}
System.out.println("Number \t\t Frequency");
for (int j = 0; j < 10; j++){
    System.out.println(j + "\t\t" + frequency[j]);
}

System.out.println();


// Lab Task 1.7. write a menu driven java program to convert decimal to binary and vice versa: code to convert an integer from decimal number system(base-10) to binary number system(base-2) and vice versa 😊



System.out.println("Enter '1' for decimal to Binary. Enter '2' for binary to decimal: ");
Scanner YY = new Scanner(System.in);
int choice = YY.nextInt();

switch (choice){
    case 1:
        System.out.println("Enter a decimal number: ");
        int decNumber = YY.nextInt();        
       System.out.println(decNumber + " = " + Integer.toBinaryString(decNumber)+ " in decimal");
       break;
    case 2:
        System.out.println("Enter a binary number: ");
        String biNumber = YY.next();
        System.out.println(biNumber + " = " + Integer.parseInt(biNumber, 2) + " in binary");  
        break; 

}




}
 }
