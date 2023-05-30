//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //set up scanner.
        Scanner scanner = new Scanner(System.in);      
         

        System.out.println("Hello. What is your name?");
        String userName = scanner.next();

                           
        //add new a line before asking next question. 
        System.out.println(String.format("\nHi %s! I'm Javabot. Where are you from?", userName));
        //Pick up user's home and store it.
        String userHome = scanner.next(); 
                        

        //add new a line before asking next question.
        System.out.println(String.format("\nI hear it's beautiful at %s! I'm from a place called Oracle", userHome));
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int userAge = scanner.nextInt();


        //add new a line before asking next question.
        System.out.println(String.format("\nSo you're %d, cool! I'm 400 years old.", userAge));
	int botAge = 400;
        System.out.println("\tThis means I'm " +  botAge / userAge + " times older than you.");
        System.out.println("\tEnough about me.");
	System.out.println("\nWhat's your favourite language? (just don't say Python)");
        //Pick up language and store it.
        scanner.nextLine();
        String favoriteProgrammingLanguage = scanner.nextLine(); 


        //add new a line here.
        System.out.println(String.format("\n%s, that's great! Nice chatting with you %s. I have to log off now. See ya!", favoriteProgrammingLanguage, userName));
        
        //close scanner. 

        
    }
}
