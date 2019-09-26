import java.util.Scanner;

public class BladesOfGlory {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Set some variables
        double lowScore = 10;
        double highScore = 0;
        double totalScore = 0;
        //Goes through judges
        for (int judge = 1; judge<10; judge++){
            System.out.print("Please enter judge #" + judge + "'s score : ");
            double score = input.nextDouble();
            //Checks of the score is valid
            while (score<0 || score>10){
                System.out.print("Please enter judge #" + judge + "'s score between 0 and 10 : ");
                score = input.nextDouble();
            }
            //Gets highest score and stores it
            if (score>highScore){
                highScore = score;
            }
            //Gets lowest score and stores it
            else if (score<lowScore){
                lowScore = score;
            }
            //Add up every score given
            totalScore = totalScore + score;
        }
        //Calculate final score
        double finalScore = (totalScore - highScore - lowScore) / 7;
        System.out.println("Your final score is " + finalScore);
    }
}

//1. Evgenia Medvedeva
//2. A lutz is a toe jump while nn Axel and Salchow are edge jumps. And an axel has an extra half rotation
//   compared to a Salchow
//3. Brian Boitano