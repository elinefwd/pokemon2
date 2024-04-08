
import java.util.List;

public interface PokemonGym {

    void enteredTheGym(PokemonTrainer player1);

    void printPokemon(List<Pokemon> pokemons);

    Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);

    Pokemon choosePokemon(PokemonTrainer trainer);

    int randomAttackByGymOwner();

    // Add any additional methods required by the interface

}

