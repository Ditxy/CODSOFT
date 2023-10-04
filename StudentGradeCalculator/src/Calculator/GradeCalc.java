package Calculator;

import java.util.Scanner;
public class GradeCalc 
{
   public static void main(String[] args)
   {
	   Scanner in = new Scanner(System.in);
       System.out.println("Student Grade Calculator");
       char a;
       do
       {
       System.out.print("Enter the number of subjects: ");
       int n = in.nextInt();
       double Total = 0;
       for (int i = 1; i <= n; i++)
       {
           System.out.print("Enter marks obtained in Subject " + i + " (out of 100): ");
           double marks = in.nextDouble();
           if (marks < 0 || marks > 100)
           {
               System.out.println("Invalid marks. Marks should be between 0 and 100.");
               i--; 
           }
           else
               Total += marks;
       }
       double AvgPerc = Total / n;
       char g;
       if (AvgPerc >= 90)
           g = 'O';
       else if (AvgPerc >= 80)
           g = 'A';
       else if (AvgPerc >= 70)
           g = 'B';
       else if (AvgPerc >= 60)
           g = 'C';
       else if (AvgPerc >= 50)
           g = 'D';
       else
    	   g = 'F';
       System.out.println("Total Marks: " + Total);
       System.out.println("Average Percentage: " + AvgPerc + "%");
       System.out.println("Grade: " + g);
       System.out.println("Would you like to calculate grades for another student?");
       System.out.println("If yes, enter 'y', otherwise enter 'n'");
       a = in.next().charAt(0);
       } 
       while (a =='Y'||a =='y');
       System.out.println("Thank you for using this program.");

       in.close();

	}

}

