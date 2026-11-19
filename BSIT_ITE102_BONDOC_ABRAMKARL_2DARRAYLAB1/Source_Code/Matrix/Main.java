/*
    Student Name: Abram Karl B. Bondoc
    Course: BS Information Technology
    Activity: Java USING 2 Dimensional Array
    Exercise: Exercise 1
    Description: Make a 3x3 table and calculate the column sum, row sum, and 2 Diagonal sums

*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Starting Program");
        char y;
        do {
        int[][] matrix = new int[3][4]; //1. Declare and create
        Scanner input = new Scanner(System.in); //2. Create a scanner object named input
        System.out.println("Enter 9 Elements.....");
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix.length; c++) {
                matrix[r][c] = input.nextInt(); //its as it says, its the input
            }
        } // Main input for loop to get the stuff
                int rowSum1 = matrix[0][0] + matrix[0][1] + matrix[0][2];
                int rowSum2 = matrix[1][0] + matrix[1][1] + matrix[1][2];
                int rowSum3 = matrix[2][0] + matrix[2][1] + matrix[2][2]; // So this is the part where it adds the inputs and then adds them as instructed and assigns their variables to be used later for me to put them into arrays
                int colSum1 = matrix[0][0] + matrix[1][0] + matrix[2][0];
                int colSum2 = matrix[0][1] + matrix[1][1] + matrix[2][1];
                int colSum3 = matrix[0][2] + matrix[1][2] + matrix[2][2];
                int daYag1 = matrix[0][0] + matrix[1][1] + matrix[2][2];
                int anGel2 = matrix[0][2] + matrix[1][1] + matrix[2][0];
                int rowSumtest[] = {rowSum1, rowSum2, rowSum3}; // putting the variables nowwww
                int colSumtest[] = {colSum1, colSum2, colSum3};
                System.out.println("==========================================================================="); // Lil  barrier to clarify where we are in the output and/or code
                System.out.println("                                    Row Sum\n"); // yes, I counted the spaces to adjust
        for(int r = 0; r < matrix.length; r++) { // need another loop so it can print the output automatically and saves like, 10+ lines of code?
         System.out.print("                 ");
            for(int c = 0; c < matrix.length; c++) {
                System.out.print("   " + matrix[r][c]);
        }
        System.out.print("       " + rowSumtest[r]); //Had THE worst time with this single line of code. ALl I had to do was put it on for "r" block instead of making a for block code, help me understand more on the java process logic thing
        System.out.println("\n");    
    }System.out.print("Column sum:      "); 
    for(int w = 0; w < matrix.length; w++) { // a little loop for col sum so I don't keep on system printing the array list one by one
        System.out.print("   " + colSumtest[w]); // pretty simple after I had a nightmare with row sum, just needed to print it in a loop like in ma'ams examples
    }
    System.out.println("\n" + "\n" + "Diagonal sum 1: " + daYag1); // can't forget the adding of the diagonals
    System.out.println("Diagonal sum 2: " + anGel2);
    System.out.println("Restart? Y/N: ");
    y = key.next().charAt(0);
        }  while (y == 'y' || y == 'Y');  
        key.close(); //first time I had to close a scanner because the yellow underline in the scanner was bothering me a lot also, can't close the input scanner here
    }
}