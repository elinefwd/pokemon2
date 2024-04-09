public class FirePokemon extends Pokemon {
    private int firePower;


    public FirePokemon(String name, int level, int hp, String type, String electricPower) {
        super(name, type, level, hp);
        // Assign the electricPower value here if needed
    }

    public void specialAttack() {
        System.out.println("Fire Pokemon uses Fire Blast!");
    }

    @Override
    public void attack() {
        System.out.println("Fire Pokemon attacks with fire!");
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }
}
