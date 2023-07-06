public class Hero extends Character{
   private String name;
   private Weapon weapon;

    public Hero(String name, int health, int damage, Weapon weapon) {
        super(health, damage);
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }


    public String getInfo(){
        return "NAME: " + getName() +
                "\nHEALTH: " + getHealth() +
                "\nDAMAGE: " + getDamage() +
                "\nWEAPON NAME: " + weapon.getWeaponName() +
                "\nWEAPON TYPE: " + weapon.getWeaponType();
    }

    public final void attack(){
        System.out.println("Let's attack!!!");
    }

    public String attack(Weapon weapon){
        return  this.getName() + " attack and use Weapon: " + weapon.getWeaponName() + " with type: " + weapon.getWeaponType();
    }
}
