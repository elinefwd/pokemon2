import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private static final FirePokemon charizard = new FirePokemon("Charizard", 76, 150, "firenougats", "GRRRRRRRRRRRRRRR");
    private static final WaterPokemon blastoise = new WaterPokemon("Blastoise", 40, 110, "Pokeflakes", "Blaaaaasssssstooooiiiiissss");
    private static final GrassPokemon venusaur = new GrassPokemon("Venusaur", 50, 135, "Pokeleafs", "Veeeeeeeeennnnnuuuuuusaur");
    private static final GrassPokemon ditto = new GrassPokemon("Ditto", 60, 140, "Everything", "Ditto diiiito ");
    private static final ElectricPokemon raichu = new ElectricPokemon("Raichu", 80, 160, "Pokebrocks", "Raaaaiiiiicccchhhhuuuuuuu!!!!");
    private static final WaterPokemon gyarados = new WaterPokemon("Gyarados", 90, 180, "Pokeflakes", "Gyaaaaaaaaarrrraaaadoooos");

    private static List<Pokemon> pokemons = Arrays.asList(charizard, blastoise, venusaur, ditto, raichu, gyarados);

    public static void main(String[] args) {
        Scanner playerInput = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl(pokemons);
        System.out.println("First player, please enter your name: ");
        String userA = playerInput.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA, pokemons);
        System.out.println("To start your game, we have given you 6 Pokemons to use.");
        System.out.println("These are the Pokemons you have:");
        pokemonGym.printPokemon(pokemons);
        System.out.println("Would you like to enter a gym looking for a fight?");
        System.out.println("Please enter 'yes' or 'no'.");
        if (playerInput.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }
    }
}
