
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        String guessLetter = letter;
        
        if(!guessedLetters.contains(guessLetter)){
            this.guessedLetters += guessLetter;
            if(word.contains(guessLetter)){
                
            }
            else{
                
                numberOfFaults++;
            }
               
        }

    }

    public String hiddenWord() {
        String hiddenWord="";
        for (int i = 0; i<this.word.length(); i ++){
            
            if(guessedLetters.indexOf(word.charAt(i)) >= 0){
                hiddenWord += word.charAt(i);
            }
            else{
                hiddenWord += "_";
            }
                  
        }

        return hiddenWord;
    }
}
