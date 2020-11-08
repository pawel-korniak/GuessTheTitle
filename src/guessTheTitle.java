import java.io.File;
import java.util.Scanner;

public class guessTheTitle {
    //function will add next char to the title to show , unadded chars wi be '_'
    public static void main(String [] args) throws Exception{
        File file = new File("text.txt");
        Scanner scanner = new Scanner(file);
        Scanner read = new Scanner(System.in);
        int linesCount=0;
        while(scanner.hasNextLine()){
            scanner.nextLine();
            linesCount ++;
        }

        int titleNumber = (int) (Math.random() * linesCount);
        Scanner titleScanner = new Scanner(file);
        for(int i=0;i<titleNumber;i++)titleScanner.nextLine();

        Title titleToGuess = new Title(titleScanner.nextLine());


        boolean guessed=false;
        while(!(guessed)){
            System.out.println(titleToGuess.name);
            titleToGuess.printTitle();
            System.out.print("Guess letter or Title : ");
            String guess= read.nextLine();
            System.out.println();
            if(guess.length()==1){
                titleToGuess.addChar(guess.charAt(0));
            }
        }

    }
}
