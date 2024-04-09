
import java.util.ArrayList;
import java.util.List;

public class DefineList {
    public static void main(String[] args) {
        // Create a List
        List<String> namesList = new ArrayList<>();

        // Add elements to the list
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");

        // Access elements from the list
        String secondName = namesList.get(1);
        System.out.println("Second name in the list: " + secondName);

        // Iterating over elements in the list
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
