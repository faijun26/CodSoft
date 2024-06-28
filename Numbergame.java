import java.util.Scanner;
//import java.util.Random;
public class Numbergame {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int numberoftries=0;
   int guess=0;
   System.out.println("enter targetnumber");
   int targetNumber=sc.nextInt();
    
    Scanner userInput=new Scanner(System.in);
    while(guess!=targetNumber){
        guess=userInput.nextInt();
        numberoftries++;
        if(guess==targetNumber){
            System.out.println("Your Guess is Correct");
        }
        else if(guess<targetNumber){
            System.out.println("Your Guess is low");
        }
        else{
            System.out.println("Your Guess is high");
        }
    }
    System.out.println(numberoftries);
    sc.close();
    userInput.close();
}
}

    

