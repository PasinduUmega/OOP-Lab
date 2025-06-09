import java.util.Scanner;

class InvalidScoreException extends Exception{
    public InvalidScoreException(String message){
        super(message);
    }
}
class ScoreOutOfRangeException extends Exception{
    public ScoreOutOfRangeException(String message){
        super(message);
    }
}
public class ExamManager {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score exam:");
        double score = scanner.nextDouble();

        try {
            if(score<=0){
                throw new InvalidScoreException("Invalid score.Exam scores cannot be negative.");
            }
            if (score >100){
                throw new ScoreOutOfRangeException("Score out of range. Exam scores must be between 0 and 100.");
            }
        }catch (InvalidScoreException|ScoreOutOfRangeException e){
            System.out.println("Error: " + e.getMessage() );
        }
    }
}
