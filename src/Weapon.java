public class Weapon {
    private String weaponName;
    private WeaponType weaponType;

    public String getWeaponName() {
        return weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public Weapon(String weaponName, WeaponType weaponType) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
    }
}
