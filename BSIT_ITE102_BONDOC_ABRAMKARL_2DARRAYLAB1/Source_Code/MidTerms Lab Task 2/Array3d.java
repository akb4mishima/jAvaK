/*
    Student Name: Abram Karl B. Bondoc
    Course: BS Information Technology
    Activity: Java USING 3 Dimensional Array
    Exercise: Exercise 2
    Description: Make a Grading system that inputs and outputs the grades average and section average

*/
import java.util.Scanner;
public class Array3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a;
        do {
        double reCords[][][] = new double[2][3][3];
        String subj[] = {"Java: ", "Database: ", "Networking: "};
        for(int x = 0; x < 2; x++)
        {
            System.out.println("\n" + "SECTION " + (x+1));
            for(int y = 0; y < 3; y++)
            {
                System.out.println("\n");
                System.out.println("Student " + (y+1));
                for(int z = 0;z< 3; z++)
                {
                    System.out.print("Input grade in " + subj[z]);
                    reCords[x][y][z] = sc.nextDouble();
                }
            }
        }
        System.out.println("\n");
        double solv3later[] = new double [3];
        
        for(int x = 0; x < 2; x++)
        {   
            System.out.println("SECTION " + (x+1));
            System.out.println("----------------------");
            for(int y = 0; y < 3; y++)
            { 
                double aver4ge = (reCords[x][y][0] + reCords[x][y][1] + reCords[x][y][2]) / 3;
                for(int z = 0; z < 1; z++)
                {
                    System.out.println("Student " + (y+1));
                    System.out.printf("Java: %.0f%n", reCords[x][y][0]);
                    System.out.printf("Database: %.0f%n", reCords[x][y][1]);
                    System.out.printf("Networking: %.0f%n", reCords[x][y][2]);
                    System.out.printf("Student Average: %.2f%n \n", aver4ge);
                    solv3later[y] = aver4ge; 
                }
            } 
            double secAv3rge = (solv3later[0] + solv3later[1] + solv3later[2]) / 3;
            System.out.printf("Section Average: %.2f", secAv3rge);
            System.out.println("\n" + "\n");
            }
            System.out.print("Make new list? Y/N: "); 
            a = sc.next().charAt(0);
    } while (a == 'y' || a == 'Y');
    sc.close();
    }
}
