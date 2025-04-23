import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Taking User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text.");
        String input = sc.nextLine();

        // Creating Word object to store the text
        Word text = new Word(input);

        System.out.println(text.countAll());

    }
}
