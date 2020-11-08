public class Title {
    char [] toShow= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    String name;
    int added;

    void addChar(char c){
        this.toShow[added]=c;
        added++;
    }
    void printTitle(){
        for(int i=0;i<=(name.length()-1);i++){
            boolean isAdded=false;
            for(int j=0;j<added;j++){

                if(name.charAt(i) == toShow[j]){
                    System.out.print(name.charAt(i));
                    isAdded=true;
                }

            }
            if(!(isAdded) && name.charAt(i)!=' '){
                System.out.print('_');
            } else System.out.print(' ');
        }
        System.out.println();
    }
    Title(String name){
        this.name=name;
        added = 0;
        //toShow = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
    }
}
