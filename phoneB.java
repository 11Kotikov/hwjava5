import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class phoneB {

    public static void phoneBook() {
        HashMap<String, ArrayList<String>> book = new HashMap<String, ArrayList<String>>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Select the option: ");
            System.out.println("1. Add phone number");
            System.out.println("2. Show phone book");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine();
            
            if (choice == 1) {
                addNumber(book, input);
            } else if (choice == 2) {
                printAll(book);
            } else if (choice == 3) {
                System.out.println("ooooh noooo!! Don't leave me alone");
                break;
            } else {
                System.out.println("Incorrect");
            }
        }
    }

    public static void addNumber(HashMap<String, ArrayList<String>> book, Scanner input) {

        System.out.print("Input name: ");
        String name = input.nextLine();

        System.out.print("Input phone number: ");
        String number = input.nextLine();

        ArrayList<String> numbers = book.getOrDefault(name, new ArrayList<String>());
        numbers.add(number);
        book.put(name, numbers);

        System.out.println("Number " + number + " added for " + name);
    }

    public static void printAll(HashMap<String, ArrayList<String>> book) {
        for (String name : book.keySet()) {

            System.out.println("\n" + name + ": " + book.get(name) + "\n");
        }
    }

    public static void main(String[] args) {
        phoneBook();
    }

}

