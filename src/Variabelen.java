import java.util.Arrays;
import java.util.List;

public class Variabelen {
    // Variables that occur multiple times
    private String type; // Should be private for encapsulation
    private List<String> attacks; // Should be private and initialized elsewhere
    private String name; // Should be private for encapsulation

    // Variables that occur only once
    private List<Pokemon> pokemons; // Should be private and initialized elsewhere
    private int level;
    private int hp;
    private String food; // Consider the data type and initial value
    private String sound; // Consider the data type and initial value
    private String town; // Consider the data type and initial value

    // Constructor
    public Variabelen(String type, List<String> attacks, String name,
                      List<Pokemon> pokemons, int level, int hp,
                      String food, String sound, String town) {
        this.type = type;
        this.attacks = attacks;
        this.name = name;
        this.pokemons = pokemons;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.town = town;
    }

    // Getters and setters for the variables (generated automatically for brevity)
    // Ensure appropriate access modifiers for getters and setters

    // Getters
    public String getType() {
        return type;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    // Implement similar getters and setters for the other variables

}
