package Numbers;

import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
 public static void main(String args[])
 {
  int n,x,s,p=20;
  char ans='y';
  Scanner in = new Scanner(System.in);
  Random rand = new Random();
  System.out.println("____________________________NUMBER GAME______________________________");
  System.out.println("Are you a good guesser? Play this game to test your guessing skills!");
  System.out.println("Rules of the game are as follows :");
  System.out.println("* Computer will randomly generate a number, you have to guess what number it is.");
  System.out.println("* You will get 10 attempts to correctly guess what the number is. Don't worry, you'll get hints :)");
  System.out.println("* REMEMBER!!! Your personal best will be the least number of attempts taken by you to guess the generated number correctly.");
  System.out.println("Best of Luck! Happy Guessing :)");
  System.out.println(".........................................");
  while(ans=='y'||ans=='Y')
  {
   n=rand.nextInt(100);   
   System.out.println("A random number has been generated from the range 0 - 99. Take a guess and enter a number. ");
   x=in.nextInt();
   s=1;
   if(x==n)
   {
    System.out.println("Your guess is correct. the number is "+x+" and no. of attempts taken is "+s);
    System.out.println("Your new personal best is 1");
    p=1;
   }
   while(x!=n)
   {
    do
    {
    if(x>n+50)
     System.out.println("Its much more than the generated number.");
    else if(x>n+20)
     System.out.println("Its more than the generated number.");
    else if(x>n)
     System.out.println("Its more than the generated number, but you're close.");
    else if(x<n&&x>n-20)
     System.out.println("its less than the generated number, but you're close.");
    else if(x<n-20&&x>n-50)
     System.out.println("Its less than the generated number.");
    else if(x<n-50)
     System.out.println("Its a lot less than the generated number");
    s++;
    System.out.println("Guess the number again.");
    x=in.nextInt();
    if(x==n)
     System.out.println("Your guess is correct. the number is "+x+" and no. of attempts taken is "+s);
    if(x==n) 
     break;
    }while(s<10);
    if(s==10)
     System.out.println("You've reached the maximum number of attempts, sorry:(");
    break;
   }
   if(s<p && s<11 && x==n)
   { 
    p=s;
    System.out.println("Your new Personal Best is "+p);
   }
   else if(s>=p && s<11 && x==n && s!=1)
    System.out.println("Your Personal Best is still "+p);
   System.out.println("If you wish to play the game again, please enter 'Y' if your answer is yes. Otherwise, if your answer is no, enter 'N'");
   ans=in.next().charAt(0);
   if(ans=='N')
   break;
  }
  System.out.println("Thank you for playing my game."); 
 }
}