import java.util.Scanner;

class numbergame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int roundsWon = 0;
        String playAgain;
        System.out.println("Welcome to Number Game.\n Rules:- \n 1.you have to guss a number between 1 and 100 \n 2. you can guss that number only in 5 attempts\n");
        System.out.println("Start,All The Best\n");
        do {
            int randomNum = (int)(Math.random() * 100) + 1;
            int attempts = 5;
            int correct = 0;

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt " + i + " - Enter your number: ");
                int number = sc.nextInt();

                if (number < randomNum) {
                    System.out.println("Your number is lower than the required number.");
                } else if (number > randomNum) {
                    System.out.println("Your number is higher than the required number.");
                } else {
                    System.out.println("Well done! You entered the correct number.");
                    correct = 1;
                    roundsWon++;
                    break;
                }
            }

            if (correct == 0) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + randomNum);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Thank you for your time!");
        sc.close();
    }
}
