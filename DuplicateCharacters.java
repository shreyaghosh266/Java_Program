import java.util.*;

public class DuplicateCharacters {

    // Function to print the duplicate characters from a given string
    public void printDuplicates(String s) {
        // Convert the string to lowercase to ignore case sensitivity
        s = s.toLowerCase();

        // Create a map to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        // Traverse through the string and fill the frequency map
        for (char c : s.toCharArray()) {
            // Ignore spaces
            if (c != ' ') {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        // Iterate over the frequency map to find and print the characters that appear more than once
        System.out.print("Duplicate characters: ");
        boolean foundDuplicates = false;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                foundDuplicates = true;
            }
        }

        // If no duplicates were found
        if (!foundDuplicates) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");

        // Read the user input
        String input = scanner.nextLine();

        // Create an instance of DuplicateCharacters
        DuplicateCharacters duplicateCharacters = new DuplicateCharacters();

        // Call printDuplicates to print the duplicate characters
        duplicateCharacters.printDuplicates(input);

        // Close the scanner
        scanner.close();
    }
}
