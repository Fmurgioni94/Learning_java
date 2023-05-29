import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        Scanner sc = new Scanner(System.in);
        int counter = 0;

        System.out.println("What is your name?");
        String name = sc.nextLine();
        counter++;
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = sc.nextDouble();
        counter++;
        System.out.println("How much money do you spend on fast food?");
        double foodPrice = sc.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = sc.nextInt();
        counter++;
        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = sc.nextInt();
        counter++;

        sc.close(); // to avoid resource leak.

        double coffeeTotalPrice = coffeePrice * coffeeAmount;
        double foodTotalPrice = foodPrice * foodAmount;

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println(String.format("Thank you %s for answering all %d questions", name, counter));
        System.out.println(String.format("Weekly, you spend %.2f $ on coffee", coffeeTotalPrice));
        System.out.println(String.format("Weekly, you spend %.2f $ on food", foodTotalPrice));

    }
}
