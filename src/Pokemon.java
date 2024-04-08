

public class Pokemon {
    private String name;
    private String type; // Fire, Water, Grass, Electric, etc.
    private int level;
    private int hp;

    // Constructor
    public Pokemon(String name, String type, int level, int hp) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
    }

    // Getters and setters (generated for brevity)
    // Ensure appropriate access modifiers and data types

    // Getters
    public String getName() {
        return name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Implement similar getters and setters for type, level, and hp
}

