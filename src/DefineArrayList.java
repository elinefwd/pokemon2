import java.util.ArrayList;
import java.util.List;

public class DefineArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        List<String> namesList = new ArrayList<>();

        // Add elements to the ArrayList
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Access elements from the ArrayList
        String secondName = namesList.get(1);
        System.out.println("Second name in the list: " + secondName);

        // Iterating over elements in the ArrayList
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
