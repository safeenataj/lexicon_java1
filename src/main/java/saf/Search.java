package saf;


    import java.util.Scanner;

public class Search {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();


        String storedString = userInput;


        System.out.println("You entered: " + storedString);


        scanner.close();
    }
}

