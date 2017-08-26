import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        start();
        star();
        timeBudget();
        star();
    }
        public static void start () {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Vacation Planner!");
            System.out.println("What is your name?");
            String name = input.nextLine();
            System.out.println("Nice to meet you " + name + ". where are you travelling to?");
            String place = input.nextLine();
            System.out.println("Great! " + place + " sounds like a great trip.");
        }
        public static void star () {
        System.out.println("********");
        System.out.println();
        }
        public static void timeBudget (){
            Scanner input = new Scanner(System.in);
            System.out.println("How many days are they going to spend in their destination?");
            int days = input.nextInt();
            System.out.println("How much money, in USD, are you planning to spend on your trip?");
            float cash = input.nextFloat();
            System.out.println("What id the three letter currency symbol for your travel destination?");
            String currency = input.next();
            System.out.println("How many " + currency + " are there in 1 USD?");
            float exchange = input.nextFloat();
            float currencyCash = cash * exchange;
            System.out.println();
            int hour = days * 24;
            int minuts = hour * 60;
            System.out.println("If you are travelling for " + days + " days that is the same as " + hour + " hours or " + minuts + " minutes");
            float x = cash / days;
            int y = (int) cash;
            float curryCashonDay = currencyCash / days;
            System.out.printf("If you are going to spend %d USD that means per day you can spend up to %.2f USD\n", y, x);
            System.out.printf("Your total budget in %s is %.2f %s, which per day is %.2f %s\n", currency, currencyCash, currency, curryCashonDay, currency);
        }

}
