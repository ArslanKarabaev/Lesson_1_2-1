public class Main {
    public static void main(String[] args) {
    Weapon heroesWeapon = new Weapon("EKSKALIBUR", WeaponType.SWORD);
    Weapon assistantWeapon = new Weapon("STICK", WeaponType.STAFF);
    Weapon medicStaff = new Weapon("KIT", WeaponType.HEAL);

    Hero hero = new Hero("ARTUR",250, 15, heroesWeapon);
    Assistant assistant = new Assistant("MERLIN",100, 10, assistantWeapon, "MAGIC");
    Assistant medic = new Assistant("KRISTOFER",200, 10, medicStaff, "SUPER HEAL");

        hero.attack();

        System.out.println(hero.getInfo());
        System.out.println(hero.attack(heroesWeapon));

        System.out.println(assistant.getInfo());
        System.out.println(assistant.attack(assistantWeapon));

        System.out.println(medic.attack(medicStaff));
        System.out.println(medic.getInfo());


    }
}