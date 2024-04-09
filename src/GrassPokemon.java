public class GrassPokemon extends Pokemon {
    private int grassPower;



    public GrassPokemon(String name, int level, int hp, String type, String grassPower) {
        super(name, type, level, hp);
        // Assign the grassPower value here if needed
    }


    public void specialAbility() {
        System.out.println("Grass Pokemon uses Solar Beam!");
    }



    @Override
    public void attack() {
        System.out.println("Grass Pokemon attacks with grass!");
    }

    public int getGrassPower() {
        return grassPower;
    }

    public void setGrassPower(int grassPower) {
        this.grassPower = grassPower;
    }
}
