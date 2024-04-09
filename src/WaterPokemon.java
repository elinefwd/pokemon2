public class WaterPokemon extends Pokemon {
    private int waterPower;


    public WaterPokemon(String name, int level, int hp, String type, String waterPower) {
        super(name, type, level, hp);
        // Assign the waterPower value here if needed
    }


    public void specialMove() {
        System.out.println("Water Pokemon uses Hydro Pump!");
    }

    @Override
    public void attack() {
        System.out.println("Water Pokemon attacks with water!");
    }

    public int getWaterPower() {
        return waterPower;
    }

    public void setWaterPower(int waterPower) {
        this.waterPower = waterPower;
    }
}
