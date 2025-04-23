import java.util.ArrayList;
import java.util.Arrays;

public class Word {

    private String words;
    private ArrayList<String> wordList;

    public Word(String words) {
        this.words = words;
    }

    public ArrayList<String> getWordList() {
        String[] wordsArray = words.split("\\s+");
        return new ArrayList<>(Arrays.asList(wordsArray));
    }

    public Integer countWords(){
        int count = 0;

        for (String word : getWordList()) {
            count += 1;
        }

        return count;
    }

    public Integer countCharacters(){return words.length();}

    public Integer countParagraphs(){
        String[] paragraphs = words.split("\\n+");
        int count = 0;

        for (String paragraph : paragraphs) {
            if (!paragraph.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public Integer countSentences(){
        String[] sentences = words.split("\\.");
        int count = 0;
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public String countAll(){
        return countWords() + " words" + "\n"
                + countCharacters() + " characters" + "\n"
                + countSentences() + " sentences" + "\n"
                + countParagraphs() + " paragraphs";
    }


}
