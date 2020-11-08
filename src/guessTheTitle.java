import java.io.File;
import java.util.Scanner;

public class guessTheTitle {

    public static void main(String [] args) throws Exception{
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        Scanner read = new Scanner(System.in);
        int linesCount=0;
        while(scanner.hasNextLine()){ //counting lines to get range of randomization
            scanner.nextLine();
            linesCount ++;
        }

        int titleNumber = (int) (Math.random() * linesCount);
        Scanner titleScanner = new Scanner(file);
        for(int i=0;i<titleNumber;i++)titleScanner.nextLine(); // go to random line in file

        Title titleToGuess = new Title(titleScanner.nextLine()); // set random line to Title object

        int mistakes=0;
        boolean guessed=false;
        while(!(guessed) && mistakes<10){
            //System.out.println(titleToGuess.name);   //  just for testing
            titleToGuess.printTitle();
            System.out.print("Guess letter or Title : ");
            String guess= read.nextLine();
            System.out.println();
            if(guess.length()==1){ // if user enter one letter it is used in addChar to check if is in title
                if(!(titleToGuess.addChar(guess.charAt(0))))mistakes++; //addChar run and returns false if letter is not in title, then it is counted as mistake
            } else if(guess.equals(titleToGuess.name)){ // win condition
                guessed = true;

            }else mistakes++;
        System.out.println("Mistakes - "+mistakes);
        }
        if(guessed)System.out.println("You are right"); else System.out.println("out of chances");
    }
}
