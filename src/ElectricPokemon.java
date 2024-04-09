public class ElectricPokemon extends Pokemon {
    private int electricPower;

    public ElectricPokemon(String name, int level, int hp, String type, String electricPower) {
        super(name, type, level, hp);
        // Assign the electricPower value here if needed
    }




    public void thunderShock() {
        System.out.println("Electric Pokemon uses Thunder Shock!");
    }

    @Override
    public void attack() {
        System.out.println("Electric Pokemon attacks with electricity!");
    }

    public int getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(int electricPower) {
        this.electricPower = electricPower;
    }
}
