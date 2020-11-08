public class Title {
    char [] toShow= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};//empty chars for printing correct letters guessed
    String name;    // title
    int added;  // correct letters counter for toShow array

    boolean addChar(char c){ /// get char to chceck if it's in title, if it is , returns true

        boolean isInTitle=false;
        for(int i=0;i<=this.name.length()-1;i++){
            if(this.name.charAt(i)==c){   // comparing every char of string
                isInTitle=true;
            }
        }
        if(isInTitle){
            this.toShow[added]=c; // if title contains argument, is added to array
            added++;
        }
        return isInTitle;
    }
    void printTitle(){ // printing title with '_' , ' ' and letters added by addChar function

        for(int i=0;i<=(name.length()-1);i++){
            boolean isAdded=false;
            for(int j=0;j<added;j++){

                if((name.charAt(i) == toShow[j])&&!isAdded){ // additional isAdded in case of multiple similar letters added
                    System.out.print(name.charAt(i));
                    isAdded=true;
                }

            }
            if(!(isAdded)&&!(name.charAt(i)==' ')){  // if nothing found, print '_'
                System.out.print('_');
            }
            if(name.charAt(i)==' ') System.out.print(' '); // spaces are also importatnt to guess title
        }
        System.out.println();
    }
    Title(String name){ // constructor
        this.name=name;
        added = 0;

    }
}
