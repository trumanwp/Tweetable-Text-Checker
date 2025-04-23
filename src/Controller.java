import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;


public class Controller {

    @FXML
    private TextArea inputText;

    @FXML
    private Label wordCountLabel;

    @FXML
    private Label sentenceCountLabel;

    @FXML
    private Label paragraphCountLabel;

    @FXML
    private Label characterCountLabel;

    @FXML
    private Label tweetLabel;


    @FXML
    private void countText(){
        // Retrieving text from TextArea
        String input = inputText.getText();

        // Creating new Word Object
        Word text = new Word(input);


        // Calling methods from Word
        int wordCount = text.countWords();
        int sentenceCount = text.countSentences();
        int paragraphCount = text.countParagraphs();
        int characterCount = text.countCharacters();

        // Set the result labels
        wordCountLabel.setText("Word Count: " + wordCount);
        sentenceCountLabel.setText("Sentence Count: " + sentenceCount);
        paragraphCountLabel.setText("Paragraph Count: " + paragraphCount);
        characterCountLabel.setText("Character Count: " + characterCount);


        // Calling tweet method
        String tweetStatus = text.tweet();

        // Setting label text to method return
        tweetLabel.setText(tweetStatus);

        // Changing text colour to suit background colour change
        tweetLabel.setTextFill(Color.WHITE);

        // Changing background colour based on method return
        if (text.countCharacters() <= 280) {
            tweetLabel.setBackground(Background.fill(Color.GREEN)); // Change text color to green
        } else {
            tweetLabel.setBackground(Background.fill(Color.RED)); // Change text color to red
        }
    }
}
