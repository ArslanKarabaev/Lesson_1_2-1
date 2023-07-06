public final class Assistant extends Hero{
    private String superPower;
    public Assistant(String name,int health, int damage, Weapon weapon, String superPower) {
        super(name,health, damage, weapon);
        this.superPower = superPower;
    }

    @Override
    public String attack(Weapon weapon) {
        return super.attack(weapon) + " and boost with Superower: " + superPower;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nSUPER POWER: " + superPower;

    }
}
